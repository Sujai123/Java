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
public class subarraysum0 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        boolean flg=false;
        for(int i=0;i<n;i++){
            int sum=a[i];
            for(int j=i+1;j<n;j++){
                sum+=a[j];
                if(sum==0){
                    flg=true;
                    break;
                }
            }
            if(flg)
                break;
        }
        //if(flg)
            System.out.println(flg);
    }
}
