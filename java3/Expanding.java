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
public class Expanding {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int n=str.length();
        char[] ch=str.toCharArray();
        int low=0;
        for(int i=0;i<n;i++){
            if(ch[i]>='a'&&ch[i]<='z'){
                low=i;
               break; 
            }
        }
        int j=0;
        for(int i=low;i<n;i++){
            char temp=ch[i];
            int count=0;
            j=i+1;
            while(j<n){
                if(ch[j]>='0'&&ch[j]<='9'){
                    count++;
                    j++;
                }else{
                    break;
                }
            }
            //i=i+count;
            //System.out.println(i+" "+j+" "+count);
            String temp1=str.substring(i+1,i+count+1);
            //System.out.println(temp1);
            i=i+count;
            int nn=Integer.parseInt(temp1);
            //System.out.println(nn);
            print(temp,nn);
        }
    }
    public static void print(char ch,int n){
        for(int i=0;i<n;i++){
            System.out.print(ch);
        }
    }
}
