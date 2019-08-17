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
public class Subset2 {
    static int count=0;
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        int n=arr.length,count=0,k=1;
        boolean flg=true;
        subset(arr,0,n,0);
    }
    public static void subset(int[] arr,int t,int n,int k){
        if(k==0){
        for(int i=0;i<n;i++){
            if(arr[i+k]%2!=0){
                count++;
            }
        }
        }else{
        for(int i=0;i<=n-k;i++){
            if(arr[i]%2!=0&&arr[i+k]%2!=0){
                count++;
                //System.out.println(arr[i]+" "+arr[i+k]);
                subset1(arr,i+3,n);
                i=i+2;
                
            }
        }
        }
        if(count%2!=0)
            System.out.println(count);
        else{
            count=0;
            subset(arr,0,n,k+=2);
        }
    }
    public static void subset1(int[] arr,int j,int n){
        for(int i=j;i<n;i++){
            if(arr[i]%2!=0)
                count++;
        }
    }
}
