import  java.util.*;

public class LongestConsequence{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        HashSet hs=new HashSet();
        for(int i=0;i<n;i++){
            hs.add(a[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(!hs.contains(a[i]-1)){
                int temp=a[i];
                while(hs.contains(temp)){
                    temp++;
                }
                if((temp-a[i])>max)
                max=temp-a[i];
                }
        }
        System.out.println(max);
    }
}