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
public class doubt {
    public static void main(String[] args){
        String str="1-2";
        System.out.println(str.substring(0,1)+str.substring(2));
        String str1=String.format("%s-%s-%s",str);
        System.out.println(str1);
    }
}
