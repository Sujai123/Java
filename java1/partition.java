/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class partition {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int pivot=s.nextInt();
        int count=0;
        int[] b=new int[n+1];
        for(int i=0;i<n;i++){
            if(a[i]<pivot){
                count++;
            }
        }
       
        b[count]=pivot;
        
        int l=0,r=count+1;
        for(int i=0;i<n;i++){
            if(a[i]<pivot){
                b[l++]=a[i];
            }
            if(a[i]>pivot){
                b[r++]=a[i];
            }
        }
        
        sort(b,0,l);
        sort(b,l+1,n+1);
        
        for(int i=0;i<n+1;i++){
            if(i!=count)
                System.out.print(b[i]+" ");
        }
    }
    public static void sort(int[] b,int k,int n){
        for(int i=k;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(b[i]<b[j]){
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
    }
}
