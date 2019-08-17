import java.util.*;
public class ironrod{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sln=s.nextInt();
	int[] sl=new int[n];
	for(int i=0;i<sln;i++){
		sl[i]=s.nextInt();
	}
	int[] b=new int[n+1];
	for(int i=0;i<b.length;i++)
		b[i]=-1;
	b[0]=0;
	for(int i=0;i<n;i++){
		if(b[i]!=-1)
		for(int j=0;j<sln;j++){
			if(i+sl[j]<=n){
			int max=Math.max(b[i]+1,b[i+sl[j]]);
			b[i+sl[j]]=max;
		}
		}
	}
//	for(int i:b)
//		System.out.print(i+" ");
	// int m=0;
	// for(int i=0;i<=n;i++)
	// 	if(b[i]>m)
	// 		m=b[i];
	
	System.out.println(b[n]);
}
}