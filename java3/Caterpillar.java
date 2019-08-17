/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Caterpillar {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int[] l=new int[n1];
        int[] k=new int[n1];
        int[][] j=new int[n1][];
        for(int i=0;i<n1;i++){
            l[i]=s.nextInt();
            k[i]=s.nextInt();
            j[i]=new int[k[i]];
            for(int m=0;m<k[i];m++){
                j[i][m]=s.nextInt();
            }
        }
        for(int i=0;i<n1;i++){
            int[] temp=new int[l[i]];
            for(int m=0;m<k[i];m++){
                temp=factor(j[i],l[i],temp);
            }
        int count=0;
        for(int t=0;t<temp.length;t++){
                if(temp[t]==0)
                    count++;
            }
        System.out.println(count);
        }
    }
    public static int[] factor(int n[],int l,int[] temp){
        for(int i=1;i<=l;i++){
            for(int j=0;j<n.length;j++){
                if(i%n[j]==0){
                    temp[i-1]++;
                //    System.out.println(temp[i-1]);
                }
            }
        }
//        int count=0;
//        for(int t=0;t<temp.length;t++){
//                if(temp[t]==0)
//                    count++;
//            }
        return temp;
    }
}
