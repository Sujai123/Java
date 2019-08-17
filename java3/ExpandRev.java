/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

/**
 *
 * @author HP
 */
import java.util.*;
public class ExpandRev {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int n=str.length();
        int count=0;
        char temp=str.charAt(0);
        for(int i=0;i<n;i++){
                if(str.charAt(i)==temp){
                    count++;
                }else{
                System.out.print(temp+""+count);
                    temp=str.charAt(i);
                    count=0;
                    i--;
                }
        }
            System.out.print(temp+""+count);
    }
}
