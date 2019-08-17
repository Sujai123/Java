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
public class Spiral {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[][] res=new int[4][4];
        int m=4,n=4,k=0,l=0,p=0,q=0;
        while(k<m&&l<n){
        for(int i=l;i<n;++i){
            res[k][i]=arr[p];
            p++;
        }k++;
        for(int i=k;i<m;++i){
            res[i][n-1]=arr[p];
            p++;
        }n--;
        if(k<m){
            for (int i=n-1;i>=l;--i){
                res[m-1][i]=arr[p];
                p++;
            }m--;
        }
        if(l<n){
            for(int i=m-1;i>=k;--i){
                res[i][l]=arr[p];
                p++;
            }l++;
        }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(res[i][j]+" ");
            }System.out.println();
    }
    }
}
