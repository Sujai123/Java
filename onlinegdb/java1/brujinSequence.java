import java.util.*;
public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        int n=5;
        int i=0,pow=0;
        ArrayList<Integer> ar=new ArrayList<Integer>();
        while(i<n){
            int k=(int)(Math.pow(4,pow));
            ar.add(k);
            int len=ar.size();
            for(int j=0;j<len-1;j++){
                int temp=k+ar.get(j);
                ar.add(temp);
                i++;
            }
            i++;
            pow++;
        }
        System.out.println(ar);
    }
}
