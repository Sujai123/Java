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
public class java6 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        str1=str1.replace(str2,"");
        System.out.println(str1);
    }
}
