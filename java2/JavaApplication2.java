/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author HP
 */
//package oopsbasics;


public class JavaApplication2 {
	public static void main(String args[]){
		String str="UDDUDDUUDUDDUDUDDDUU";
		int c=0,m=0,v=0;
		int n=str.length();
		
		int s=n+n;
		System.out.print(s);
		String[][] res=new String[n+n][n];
		for(int i=0;i<n+n;i++) {
			for(int j=0;j<n;j++) {
				res[i][j]=" ";
			}
		}
		int k=(n+n)/2;
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='U') {
				res[--k][i]="/";
				c++;
				if(c==0)
					v++;
			}
			if(str.charAt(i)=='D') {
				res[k++][i]="\\";
				c--;
				if(c==0)
					m++;
			}
		}
		System.out.println("Mountain:"+m+" Valley"+v);
		for(int i=0;i<n+n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}
}