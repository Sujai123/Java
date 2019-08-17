/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Candles {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=n*2-1;
        int start=l/4;
        int t=0;
        int[][] arr1=new int[n][2*n-1];
        for(int i=0;i<arr1.length;i++){
            for(int k=n-i-1;k>0;k--){
                System.out.print("0\t");
                arr1[i][t]=0;
                t++;
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("1\t");
                arr1[i][t]=1;
                t++;
            }
            for(int k=n-i-1;k>0;k--){
                System.out.print("0\t");
                arr1[i][t]=0;
                t++;
            }
            t=0;
            System.out.println();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=start;j<n+start;j++){
                System.out.print(arr1[i][j]);
                if(arr1[i][j]==0)
                    count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
