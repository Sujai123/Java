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
public class Petrol {
    public  static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        int p[]=new int[tc];
        int[][] c=new int[tc][];
        int[][] d=new int[tc][];
        for(int j=0;j<tc;j++){
            p[j]=s.nextInt();
            c[j]=new int[p[j]];
            d[j]=new int[p[j]];
            for(int i=0;i<p[j];i++){
            
            c[j][i]=s.nextInt();
            d[j][i]=s.nextInt();
        }
        }
        for(int j=0;j<tc;j++){
        int index=-1;
        for(int i=0;i<p[j];i++){
            int dist=dist(i,c[j],d[j]);
            //System.out.println(dist);
            if(dist>=0)
                index=i;
        }
        System.out.println("Petrol "+(index+1));
        }
    }
    public static int dist(int j,int[] c,int[] d){
        int l=0,count=0;
        for(int i=j;i<c.length;i++){
            count++;
            l+=c[i];
            l-=d[i];
            if(l<0)
                break;
            if(i>=c.length)
                i=0;
            if(count>c.length)
                break;
        }
        return l;
    }
}
