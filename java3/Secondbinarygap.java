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
public class Secondbinarygap {
    public static void main(String[] args){
        int n=529;
        boolean flg=false;
        String s=Integer.toBinaryString(n);
        System.out.println(s);
        int[] arr;
        arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=Integer.parseInt(s.substring(i,i+1));
        }
        int count=0,k=0,k1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(count<=2){
                    k1=i;
                    continue;
                }
                k=i;
            }
            
        }
        System.out.println("The length is :"+(k-k1-1));
    }
}
