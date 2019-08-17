/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class parantheses {
    static String buffer="";
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        //String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
                push(str.charAt(i));
            }else{
                pop(str.charAt(i));
            }
        }
        System.out.println(buffer);
        int n=buffer.length();
        if(n==0)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
    public static void push(char ch){
        buffer+=ch;
    }
    public static void pop(char ch){
        int n=buffer.length();
        boolean flg=false;
        //if(buffer.contains(Character.toString(ch))){
        for(int i=n-1;i>=0;i--){
            if((buffer.charAt(i)=='('&&ch==')')||(buffer.charAt(i)=='{'&&ch=='}')||(buffer.charAt(i)=='['&&ch==']')){
                buffer=buffer.substring(0, i)+buffer.substring(i+1);
                flg=true;
                break;
            }
        }
        if(!flg)
            buffer+=ch;
        }
        //else{
          //  buffer+=ch;
        //}
    }
//}
