import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        String[] str=new String[tc];
        for(int i=0;i<tc;i++){
            str[i]=s.next();
        }
        for(int i=0;i<tc;i++){
            for(int j=0;j<str[i].length();j++){
                print(str[i].charAt(j));
            }
            System.out.println();
        }
    }
    public static void print(char ch){
        int temp=0;
        if("abc".contains(Character.toString(ch)))
        temp=2;
        if("def".contains(Character.toString(ch)))
        temp=3;
        if("ghi".contains(Character.toString(ch)))
        temp=4;
        if("jkl".contains(Character.toString(ch)))
        temp=5;
        if("mno".contains(Character.toString(ch)))
        temp=6;
        if("pqrs".contains(Character.toString(ch)))
        temp=7;
        if("tuv".contains(Character.toString(ch)))
        temp=8;
        if("wxyz".contains(Character.toString(ch)))
        temp=9;
        System.out.print(temp);
    }
}
