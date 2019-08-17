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
public class largestsubstring {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine(),res="";
        int n=str.length();
        int max=0,x=0,y=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(str.substring(i,j).contains(Character.toString(str.charAt(j)))){
                    x=i;
                    y=j;
                    break;
                }
            }
            int k=str.substring(x,y).length();
            if(k>max){
                res=str.substring(x,y);
                max=k;
            }
        }
        System.out.println(res);
        
    }
}
