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
public class java2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        String res="";
        int n=str1.length();
        for(int i=0;i<n;i++){
            if(!str2.contains(Character.toString(str1.charAt(i)))){
                res+=str1.charAt(i);
            }
        }
        System.out.println(res);
    }
}
