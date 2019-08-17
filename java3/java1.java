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
public class java1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        for(int i=0;i<n;i++){
            if(isPresent(str.charAt(i),str,i+1)){
                str=str.replace(Character.toString(str.charAt(i)), "");
                n=str.length();
                i--;
            }
        }
        System.out.println(str);
    }
    public static boolean isPresent(char ch,String str,int n){
        String str1=str.substring(n);
        if(str1.contains(Character.toString(ch)))
            return true;
        return false;
    }
}
