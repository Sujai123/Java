import java.util.*;
public class ArrangeOneZero{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        //Arrays.sort(a);
        int j=0;
        for(int i=0;j<n;i++,j++){
            if(a[i]==1){
                for(int k=i;k<n-1;k++){
                    a[k]=a[k+1];
                }i--;
                a[n-1]=1;
            }
            //System.out.println(Arrays.toString(a));
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}