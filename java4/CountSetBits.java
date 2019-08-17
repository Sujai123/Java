import java.util.*;
public class CountSetBits{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			int res=tobinary(a[i]);
			System.out.println(res);
		}
	}
	public static int tobinary(int n){
		int rem=0,count=0;
		for(int i=1;i<=n;i++){
			int j=i;
		while(j>0){
			rem=j%2;
			if(rem==1)
				count++;
			j/=2;
		}
		//count++;
	}
		return count;
	}
}