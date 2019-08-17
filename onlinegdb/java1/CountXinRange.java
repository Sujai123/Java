import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[] k=new int[t];
        int[] low=new int[t];
        int[] high=new int[t];
        for(int i=0;i<t;i++){
            k[i]=s.nextInt();
            low[i]=s.nextInt();
            high[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<t;i++){
            count=0;
            for(int j=low[i];j<=high[i];j++){
                count+=isk(j,k[i]);
            }
            System.out.println(count);
        }
    }
    public static int isk(int n,int k){
        int count=0;
        while(n!=0){
            int digit=n%10;
            if(digit==k)
            count++;
            n/=10;
        }
        return count;
    }
}
