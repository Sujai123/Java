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
public class java4 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String rev="";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}
