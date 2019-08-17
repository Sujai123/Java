/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ReversePattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n-1;i>=0;i--){
            int temp=((i+1)*(i+2))/2;
            for(int j=(temp-i);j<=temp;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
