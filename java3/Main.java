/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] n1=new int[n];
        int[][] arr=new int[n][];
        for(int i=0;i<n;i++){
            n1[i]=s.nextInt();
            arr[i]=new int[n1[i]];
            Scanner s1=new Scanner(System.in);
            for(int j=0;j<n1[i];j++){
                arr[i][j]=s1.nextInt();
            }
        }
        
        int min=-999;
        for(int i=0;i<n;i++){
            min=999;
            for(int j=0;j<n1[i]-1;j++){
                for(int k=j+1;k<n1[i];k++){
                    int diff=Math.abs(arr[i][j]-arr[i][k]);
                    if(diff<min)
                    min=diff;
                }
            }
            System.out.println(min);
        }
    }
}