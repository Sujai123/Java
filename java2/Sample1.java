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
public class Sample1 {
    public static void main(String[] args){
        String str="anna";
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    str=str.substring(0,j)+str.substring(j+1,n);
                    System.out.println(str+"1");
                    n=n-1;
                }
            }
        }
        System.out.println(str);
    }
}
