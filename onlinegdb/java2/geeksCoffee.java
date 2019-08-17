import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		int[] n=new int[tc];
		int[] m=new int[tc];
		for(int i=0;i<tc;i++){
		    n[i]=s.nextInt();
		    m[i]=s.nextInt();
		}
		for(int i=0;i<tc;i++){
		    int k=calculate(n[i],m[i]);
		    System.out.println(k);
		}
	}
	public static int calculate(int n,int m){
	    for(int i=0;i<m-1;i++){
	        n=n/2;
	    }
	    return n;
	}
}


