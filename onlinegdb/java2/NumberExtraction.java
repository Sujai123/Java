import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        s=new Scanner(System.in);
        String[] str=new String[tc];
        for(int i=0;i<tc;i++){
            str[i]=s.nextLine();
        }
        for(int i=0;i<tc;i++){
            System.out.println(print(str[i]));
        }
    }
    public static int print(String str){
        String str1[]=str.split(" ");
        int max=0;
        for(String temp:str1){
            if(isNumber(temp)&&(!temp.contains("9"))){
                //System.out.print(temp);
                int n=Integer.parseInt(temp);
                if(n>max)
                max=n;
            }
        }
        return max;
    }
    public static boolean isNumber(String temp){
        for(int i=0;i<temp.length();i++){
            if(!(temp.charAt(i)>='0'&&temp.charAt(i)<='9'))
            return false;
        }
        return true;
    }
}
