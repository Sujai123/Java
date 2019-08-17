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

public class Paranthesis {
    static char[] buffer=new char[10];
    static int top=-1;
    public static void main(String[] args){
        String str="(()()";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(')
                push(str.charAt(i));
            if(str.charAt(i)==')')
                pop(str.charAt(i));
        }
        for(int i=0;i<=top;i++)
            System.out.println(buffer[i]);
    }
    public static void push(char ch){
        top=top+1;
        buffer[top]=ch;
        
    }
    public static void pop(char ch){
        if(top==-1){
            push(ch);
        }else{
        buffer[top]=' ';
        top=top-1;
        }
    }
}
