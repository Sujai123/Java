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
public class rotation {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String str1=s.nextLine();
        boolean flg=false;
        for(int i=0;i<str.length();i++){
            str=str.substring(1)+str.charAt(0);
            if(str.equals(str1)){
                flg=true;
                break;
            }
        }
        System.out.println(flg);
    }
}
