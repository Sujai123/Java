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
public class GreatRightSide {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        int[] n=new int[tc];
        int[][] a=new int[tc][];
        for(int i=0;i<tc;i++){
            n[i]=s.nextInt();
            a[i]=new int[n[i]];
            for(int j=0;j<n[i];j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<tc;i++){
            for(int j=0;j<n[i];j++){
                int l=greater(j+1,a[i]);
                a[i][j]=l;
            }
            a[i][n[i]-1]=-1;
            for(int j=0;j<n[i];j++)
                System.out.println(a[i][j]);
        }
        
    }
    public static int greater(int k,int[] a){
        int max=-999;
        for(int i=k;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
}
