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
            System.out.println(capitalize(str[i]));
        }
    }
    public static String capitalize(String str){
        String[] temp=str.split(" ");
        str="";
        for(int i=0;i<temp.length;i++){
            temp[i]=temp[i].substring(0,1).toUpperCase()+temp[i].substring(1);
            str+=temp[i]+" ";
        }
        return str;
    }
}

