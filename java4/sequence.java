import java.util.*;
public class sequence{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		Arrays.sort(a);
		int max=-999;
		for(int i=0;i<n-1;i++){
			int l=0;
			for(int j=i+1;j<n;j++){
				if((a[i]+1+l)!=a[j]){
					break;
				}else{
					l++;
				}
			}
			if(l>max)
				max=l;
		}
		System.out.println(max+1);
	}
}