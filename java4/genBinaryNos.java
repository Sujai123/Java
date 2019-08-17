import java.util.*;
public class genBinaryNos{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n[]=new int[n1];
		for(int i=0;i<n1;i++){
			n[i]=s.nextInt();
		}
		for(int i=0;i<n1;i++){
			printBinary(n[i]);
		}
	}
	public static void printBinary(int n){
		String res="";
		for(int i=1;i<=n;i++){
			int j=i;
			res="";
			while(j>0){
				int digit=j%2;
				res=digit+res;
				j/=2;
			}
			System.out.print(res+" ");
		}
	}
}