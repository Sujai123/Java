package java1;
import java.util.Scanner;
public class oddfrequency {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        for(int i=0;i<n;i++){
            int count=findfreq(str,i);
            if(count%2!=0){
                System.out.print(str.charAt(i));
            }
            str=str.replace(Character.toString(str.charAt(i)),"");
                n=str.length();
                i--;
        }
        //System.out.print(str);
    }
    public static int findfreq(String str,int i){
        int count=0;
        for(int j=i;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
        }
        return count;
    }
}
