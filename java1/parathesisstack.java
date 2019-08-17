/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.*;

/**
 *
 * @author HP
 */
public class parathesisstack {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        Stack stk=new Stack();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='{'||ch[i]=='['||ch[i]=='('){
                stk.push(ch[i]);
            }
            if(ch[i]=='}'||ch[i]==']'||ch[i]==')'){
                if(stk.size()>0){
                char temp=(char) stk.peek();
                if((temp=='('&&ch[i]==')')||(temp=='{'&&ch[i]=='}')||(temp=='['&&ch[i]==']')){
                    stk.pop();
                }
                else{
                    stk.push(ch[i]);
                }
                }
                else{
                    stk.push(ch[i]);
                }
            }
        }
    System.out.println(stk);
        if(stk.size()==0)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
