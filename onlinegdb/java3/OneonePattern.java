import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		int[] n=new int[tc];
		for(int i=0;i<tc;i++){
		    n[i]=s.nextInt();
		}
		for(int i=0;i<tc;i++){
		    generatePattern(n[i]);
		}
	}
	public static void generatePattern(int n){
	    int k=1;
	    for(int i=0;i<n;i++){
	        k*=11;
	        System.out.println(k);
	    }
	}
}

