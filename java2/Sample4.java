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
public class Sample4 {
    public static void main(String[] args){
        String str="AAABBB",res="";
        int count=0;
        res+=str.charAt(0);
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                res+=str.charAt(i+1);
            }
            else{
                count++;
            }
        }
        System.out.println("Deletions:"+count);
        System.out.println("String:"+res);
    }
}
