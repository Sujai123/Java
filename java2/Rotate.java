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
public class Rotate {
    public static void main(String [] args){
        char[] str={'@','b','@','c','@','d'};
        char[] str1;
        
        int n=str.length;
        int n1=0;
        for(int i=0;i<n;i++){
            if(str[i]>='a'&&str[i]<='z'){
                n1++;
            }
        }
        int j=0;
        str1 = new char[n1];
        for(int i=0;i<n;i++){
            if(str[i]>='a'&&str[i]<='z'){
                str1[j]=str[i];
                j++;
            }
        }
        for(char i:str1)
            System.out.print(i);
      //  int n1=str1.length();
        char temp=str1[n1-1];
        for(int i=n1-1;i>0;i--){
            str1[i]=str1[i-1];
        }str1[0]=temp;
        for(char i:str1)
            System.out.println(i);
        int k=0;
        for(int i=0;i<n;i++){
            if(str[i]>='a'&&str[i]<='z'){
                str[i]=str1[k];
                k++;
            }
        }
        for(char i:str)
            System.out.print(i);
    }
    
}
