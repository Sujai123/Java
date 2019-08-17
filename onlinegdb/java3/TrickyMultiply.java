import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int sign=1;
		if(a<0)
		sign*=-1;
		if(b<0)
		sign*=-1;
		a=Math.abs(a);
		b=Math.abs(b);
		int res=0;
		for(int i=0;i<b;i++){
		    res+=a;
		}
		System.out.println(sign*res);
	}
}


