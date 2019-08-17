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
public class Replacing {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=s.nextLine();
        System.out.println("Result:");
        if(str.contains("not")&&str.contains("poor")){
            int i=str.indexOf("not");
            int j=str.indexOf("poor");
            String str2=str.substring(i,j+4);
            System.out.println(str.replace(str2, "good"));
        }else{
            System.out.println("The given sring is INVALID");
        }
        
    }
}
