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
public class java7 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String[] str=st.split(" ");
        int n=str.length;
        int max=-1,index=-1;
        for(int i=0;i<n;i++){
            if(isPalin(str[i])){
                int l=str[i].length();
                if(l>max){
                    max=l;
                    index=i;
                }
            }
        }
        System.out.println(str[index]);
    }
    public static boolean isPalin(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i))
                    return false;
        }
        return true;
    }
}
