/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args){
        
     int[] a={1,2,1,5,5,5,7,3,2,7};
     Arrays.sort(a);
     for(int i=0;i<a.length;i++)
     System.out.println(a[i]);
        int[] b={2,2,2,2,1,3,3,3,2,2};
        for(int i=0;i<a.length;i++){
         for(int j=i+1;j<a.length;j++){
          if(b[i]<b[j]){
           int temp=a[i];
           a[i]=a[j];
           a[j]=temp;
           int temp1=b[i];
           b[i]=b[j];
           b[j]=temp1;
          }
          if(b[i]==b[j]){
           if(a[i]>a[j]){
             int temp=a[i];
           a[i]=a[j];
           a[j]=temp;
           }
          }
         }
        }
        for(int i=0;i<a.length;i++)
     System.out.print(a[i]);
    }
}
    

