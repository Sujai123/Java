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
public class ConcatenateArray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int m=s.nextInt();
        char[] ch=new char[m];
        System.out.println("Enter values:");
        for(int i=0;i<m;i++){
        ch[i]=s.next().charAt(0);
        }
        System.out.println("Enter number of values:");
        int n=s.nextInt();
        System.out.println("Result:");
        for(int i=1;i<=n;i++){
            for(int j=0;j<m;j++){
                System.out.println(ch[j]+""+i);
            }
        }
    }
}
