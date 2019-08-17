/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

/**
 *
 * @author HP
 */
public class Frequency {
    public static void main(String[] args){
        int[] count=new int[26];
        String str="Thadai";
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(count[i]>0)
            System.out.println((char)(i+97)+" = "+count[i]);
        }
    }
}
