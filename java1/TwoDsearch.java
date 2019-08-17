/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TwoDsearch {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt(),n2=s.nextInt();
        int[][] arr=new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int k=s.nextInt();
        
        int x=-1,y=-1;
        for(int i=0;i<n1;i++){
            if(arr[i][n2-1]>=k){
                x=i;
                break;
            }
        }
        //System.out.println(x);
        for(int i=0;i<n2;i++){
            if(arr[x][i]==k){
                y=i;
            }
        }
        System.out.println("x="+(x+1)+" y="+(y+1));
    }
}
