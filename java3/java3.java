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
public class java3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        boolean flg=false;
        int n=str1.length();
        for(int i=0;i<n;i++){
            if(str1.equals(str2)){
                flg=true;
                break;
            }
            str1=rotate(str1,n);
        }
        if(flg)
            System.out.println("Rotation");
        else
            System.out.println("Not a Rotation");
    }
    public static String rotate(String str,int n){
        String res="";
        char ch=str.charAt(0);
        for(int i=1;i<n;i++){
            res+=str.charAt(i);
        }
        res+=ch;
        return res;
    }
}
