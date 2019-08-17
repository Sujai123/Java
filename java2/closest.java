/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class closest {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int x=in.nextInt();
        int k=in.nextInt();
        ArrayList<sample> ar=new ArrayList();
        for(int i=0;i<n;i++){
            int diff=Math.abs(arr[i]-x);
            ar.add(new sample(arr[i],diff));
        }
        Collections.sort(ar,new SortByCount());
        for(int i=0;i<k;i++){
            sample temp=ar.get(i);
            System.out.println(temp.n);
        }
    }
}
class sample{
    int n;
    int diff;
    sample(int n,int diff){
        this.n=n;
        this.diff=diff;
    }
    @Override
    public String toString(){
        return this.n+"";
    }
}
class SortByCount implements Comparator<sample>{
    @Override
    public int compare(sample s1,sample s2){
        return s1.diff-s2.diff;
    }
}
class SortByNum implements Comparator<sample>{
    @Override
    public int compare(sample s1,sample s2){
        return s1.n-s2.n;
    }
}