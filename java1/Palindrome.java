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
public class Palindrome {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=0;
        while(n!=0){
            int digit=n%10;
            res=res*10+digit;
            n/=10;
        }
        System.out.println(res);
    }
}
