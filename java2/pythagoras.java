/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class pythagoras {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        int[] n=new int[tc];
        int[][] a=new int[tc][];
        for(int i=0;i<tc;i++){
            n[i]=s.nextInt();
            a[i]=new int[n[i]];
            for(int j=0;j<n[i];j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<tc;i++){
            //int[] b=new int[n[i]];
            ArrayList<Integer> ar=new ArrayList();
            for(int j=0;j<n[i];j++){
                //b[j]=a[i][j]*a[i][j];
                ar.add(a[i][j]*a[i][j]);
            }
            boolean flg=false;
            for(int j=0;j<ar.size();j++){
                for(int k=j+1;k<ar.size();k++){
                    int sum=ar.get(j)+ar.get(k);
                    if(ar.contains(sum)){
                        
                        flg=true;
                        break;
                    }
                }
                if(flg)
                    break;
            }
            System.out.println(flg);
        }
    }
}
