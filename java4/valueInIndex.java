import java.util.*;

public class valueInIndex{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
        int[] res=new int[max+1];
        for(int i=0;i<=max;i++){
            res[i]=-1;
        }
        for(int i=0;i<n;i++){
            res[a[i]]=a[i];
        }
        for(int temp:res){
            System.out.print(temp+" ");
        }
    }
}