/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class swapOddEvenBits {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String bin="";
        while(n!=0){
            bin=n%2+bin;
            n/=2;
        }
        if(bin.length()%2==1)
            bin='0'+bin;
        System.out.println(bin);
        char[] ch=bin.toCharArray();
        for(int i=0;i<bin.length()-1;i+=2){
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
        }
        bin=new String(ch);
        System.out.println(bin);
        int num=0;
        int k=0;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
            k=bin.length()-i-1;
            //System.out.println(k);
            num+=Math.pow(2,k);
            }
        }
        System.out.println(num);
    }
}
