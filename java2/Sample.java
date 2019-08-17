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
public class Sample {
    public static void main(String[] args){
        String str="abba";
        char[] ch=str.toCharArray();
        for(char i:ch){
            System.out.println(i);
        }
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                if(ch[i]==ch[j]&&i!=j){
                    for(int k=j;k<n-1;k++){
                        ch[k]=ch[k+1];
                    }n=n-1;
                    j--;
                }
        }
        for(int i=0;i<n;i++){
            System.out.println(ch[i]);
        }
        str=new String(ch);
        System.out.println(str);
    }
}
