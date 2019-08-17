import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		int[] n=new int[tc];
		int[][] arr=new int[tc][];
		for(int i=0;i<tc;i++){
		    n[i]=s.nextInt();
		    arr[i]=new int[n[i]];
		    for(int j=0;j<n[i];j++){
		        arr[i][j]=s.nextInt();
		    }
		}
		for(int i=0;i<tc;i++){
		    int max=max(arr[i]);
		    int nextmax=nextmax(arr[i],max);
		    System.out.println(max*nextmax);
		}
	}
	public static int max(int[] arr){
	    int max=0;
	    for(int temp:arr){
	        if(temp>max)
	        max=temp;
	    }
	    return max;
	}
	public static int nextmax(int[] arr,int n){
	    int max=0;
	    for(int temp:arr){
	        if(temp>max&&temp<n)
	        max=temp;
	    }
	    return max;
	}
}

