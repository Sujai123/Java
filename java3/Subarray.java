/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

/**
 *
 * @author HP
 */
public class Subarray {
    public static void main(String[] args){
        int n=5;
        int[] a={1,2,3,4,5};
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                print(i,j,a);
    //            System.out.println();
            }
    //        System.out.println();
        }
    }
    public static void print(int n1,int n2,int[] a){
        int diff=Math.abs(a[n1]-a[n2]);
        if(diff<=3&&n2>=n1){
        for(int i=n1;i<=n2;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        }
    }
}
