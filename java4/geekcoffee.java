import java.util.*;
public class geekcoffee{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		int[] n=new int[tc];
		int[] r=new int[tc];
		for(int i=0;i<tc;i++){
			n[i]=s.nextInt();
			r[i]=s.nextInt();
		}
		for(int j=0;j<tc;j++){
		for(int i=0;i<r[j]-1;i++){
			n[j]/=2;
		}
		System.out.println(n[j]);
	}
	}
}