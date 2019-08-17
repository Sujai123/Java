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
public class CountSetBits{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			int res=tobinary(a[i]);
			System.out.println(res);
		}
	}
	public static int tobinary(int n){
		int rem=0,count=0;
		for(int i=1;i<=n;i++){
		while(i!=1){
			rem=i%2;
			if(rem==1)
				count++;
			i/=2;
		}
                count++;
	}
		return count;
	}
}