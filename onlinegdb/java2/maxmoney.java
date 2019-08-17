import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] h=new int[n];
        int[] m=new int[n];
        for(int i=0;i<n;i++){
            h[i]=s.nextInt();
            m[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            int total=0;
            for(int j=0;j<h[i];j+=2){
                total+=m[i];
            }
            System.out.println(total);
        }
    }
}
