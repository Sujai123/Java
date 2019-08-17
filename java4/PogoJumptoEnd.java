import java.util.*;
public class PogoJumptoEnd{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		boolean flg=false;
		for(int i=0;i<n;){
			if(a[i]==0)
				break;
			i+=a[i];
			if(i==n-1){
				flg=true;
			}
		}
		System.out.println(flg);
	}
}