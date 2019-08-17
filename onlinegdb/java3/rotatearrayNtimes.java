import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int[] n=new int[n1];
        int[] k=new int[n1];
        int[][] arr=new int[n1][];
        for(int i=0;i<n1;i++){
            n[i]=s.nextInt();
            k[i]=s.nextInt();
            arr[i]=new int[n[i]];
            Scanner s1=new Scanner(System.in);
            for(int j=0;j<n[i];j++){
                arr[i][j]=s1.nextInt();
            }
        }
        for(int i=0;i<n1;i++){
            int[] res=arr[i];
            for(int j=0;j<k[i];j++){
                res=rotateleft(res,n[i]);
            }
            for(int l=0;l<n[i];l++){
                System.out.print(res[l]+" ");
            }
        }
    }
    public static int[] rotateleft(int[] arr,int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }
}
