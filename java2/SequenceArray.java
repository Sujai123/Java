/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SequenceArray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        boolean flg=false;
        System.out.println("Enter sixe of the array");
        int n=s.nextInt();
        System.out.println("Enter values");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println("Enter sixe of the array2");
        int m=s.nextInt();
        System.out.println("Enter values");
        int[] arr2=new int[m];
        for(int i=0;i<m;i++)
            arr2[i]=s.nextInt();
        for(int i=0;i<=n-m;i++){
            if(arrcontains(i,arr,arr2)){
                flg=true;
                break;
            }
        }
        if(flg)
            System.out.println("Exist");
        else
            System.out.println("Not Exist");
    }
    public static boolean arrcontains(int n,int[] arr,int[] arr2){
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]!=arr[n])
                return false;
            n++;
        }
        return true;
    }
}
