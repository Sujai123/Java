/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Calculateprofit {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max=-999;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff=a[j]-a[i];
                if(diff>max){
                    max=diff;
                }
            }
        }
        System.out.println(max);
    }
}
