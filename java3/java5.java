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
public class java5 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        boolean flg=true;
        int n=str1.length();
        for(int i=0;i<n;i++){
            if(!str2.contains(Character.toString(str1.charAt(i)))){
                flg=false;
                break;
            }else{
             str2=remove(str1.charAt(i),str2);   
            }
        }
        if(flg&&str2.length()==0)
            System.out.println("Anagram");
            else
            System.out.println("Not an Anagram");
    }
    public static String remove(char ch,String str){
        int n=str.indexOf(ch);
        str=str.substring(0,n)+str.substring(n+1);
        //System.out.println(str);
        return str;
    }
}
