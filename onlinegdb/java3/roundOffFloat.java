import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		float f=in.nextFloat();
		int n=in.nextInt();
		int l=findlength((int)f);
		String t="%."+(n-l)+"f";
		String str=String.format(t,f);
		System.out.println(str);
	}
	public static int findlength(int n){
	    int count=0;
	    while(n!=0){
	        count++;
	        n/=10;
	    }
	    return count;
	}
}

