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
public class Subset {
    public static void main(String[] args){
        int[][] res=new int[6][6];
        int[] arr={1,2,3};
        int n=arr.length,p=0;
        for(int i=0;i<arr.length;i++){
            int t=0;
            for(int k=i;k<n;k++){
                for(int j=i;j<=k;j++){
                    System.out.print(arr[j]);
                    res[p][t]=arr[j];
                    t++;
                }
                t=0;
                p++;
                System.out.println();
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}
