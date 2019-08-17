import java.util.*;
public class SemiPrime{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int low=s.nextInt();
		int high=s.nextInt();
		int[] n=findsemiPrime(low,high);
		System.out.println(Arrays.toString(n));
		int l=findcount(low,high,n);
		System.out.println(l);
	}
	public static int[] findsemiPrime(int low,int high){
		ArrayList a=new ArrayList();
		for(int i=1;i<=high;i++){
			if(isPrime(i)){
				a.add(i);
			}
		}
		int[] arr=new int[a.size()];
			for(int i=0;i<a.size();i++){
				arr[i]=(int)(a.get(i));
			}
			return arr;
		
	}
	public static boolean isPrime(int n){
		if(n==1)
			return false;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static int findcount(int low,int high,int[] arr){
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i;j<arr.length;j++){
				int prod=arr[i]*arr[j];
				if(prod>=low&&prod<=high){
					System.out.println(prod);
					count++;
				}
			}
		}
		return count;
	}
}