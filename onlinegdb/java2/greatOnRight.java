import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        int n[]=new int[tc];
        int[][] arr=new int[tc][];
        for(int i=0;i<tc;i++){
            n[i]=s.nextInt();
            arr[i]=new int[n[i]];
            for(int j=0;j<n[i];j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<tc;i++){
            arr[i]=largest(arr[i]);
            arr[i][arr[i].length-1]=-1;
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
	}
	public static int[]  largest(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        int m=greatest(arr,i+1);
	        arr[i]=m;
	    }
	    return arr;
	}
	public static int greatest(int[] arr,int n){
	    int max=0;
	    for(int i=n;i<arr.length;i++){
	        if(arr[i]>max){
	            max=arr[i];
	        }
	    }
	    return max;
	}
}


