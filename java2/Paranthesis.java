/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java4;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class Paranthesis {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        boolean flg=false;
        if(isValid(str.replace("*", ""))){
            flg=true;
        }else if(isValid(str.replace("*", "("))){
            flg=true;
        } else if(isValid(str.replace("*", ")"))){
            flg=true;
        }else if(isValid(str))
            flg=true;
        System.out.println(flg);
    }
    public static boolean isValid(String str){
        if(str.charAt(0)==')')
            return false;
        Stack<String> stk=new Stack();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stk.push(Character.toString(str.charAt(i)));
            }
            if(str.charAt(i)==')'){
                if(stk.size()==0)
                    return false;
                stk.pop();
            }
        }
        if(stk.size()==0)
            return true;
        else
            return false;
    }
}
