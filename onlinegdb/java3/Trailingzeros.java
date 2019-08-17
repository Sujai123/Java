import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		int n=in.nextInt(),count=0;
		while((n&1)==0){
		    count++;
		    n=n>>1;
		}
		System.out.println(count);
	}
}

