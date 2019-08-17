/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author HP
 */
public class Sample2 {
    public static void main(String[] args){
        String str="ANNA";
        int n=str.length();
        for(int i=0;i<n;i++){
            int temp=str.charAt(i);
            temp+=32;
            char ch=(char)(temp);
            System.out.print((char)(temp));
        }
    }
}
