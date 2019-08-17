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
public class evenfirstlast {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int h=s.nextInt();
        for(int i=l;i<h;i++){
            if(i%2==0){
                int end=i%10;
                int len=find(i);
                int start=(int) (i/Math.pow(10,len-1));
                //System.out.println(start+" "+end);
                if(end==start)
                    System.out.println(i);
            }
        }
    }
    public static int find(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}
