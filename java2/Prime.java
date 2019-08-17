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
public class Prime {
    public static void main(String[] args){
        int n=5;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=2*i+5;
        }
        //int l=0,r=0;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         int    l=left(arr[i]);
         int    r=right(arr[i]);
             //System.out.print(l+" "+r+"\n");
         int k=findmax(arr[i],l,r);
         System.out.println(k);
        }
        //System.out.print(l+" "+r+"\n");
    }
    public static int left(int n){
        for(int i=n-1;i>0;i--){
            if(isPrime(i)){
                return i;
            }
        }
        return 1;
    }
    public static int right(int n){
        for(int i=n+1;;i++){
            if(isPrime(i)){
                return i;
            }
        }
    //   return 1;
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int findmax(int n,int l,int r){
        if((n-l)<(r-n))
            return l;
        else
            return r;
    } 
}
