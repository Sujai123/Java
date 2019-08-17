import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=reverse(n);
		forward(i+5,n);
		//System.out.println(i);
	}
	public static int reverse(int n){
	    System.out.print(n+" ");
	    int i=n;
	    if(n>0){
	        i=reverse(n-5);
	    }
	    return i;
	}
	public static void forward(int n,int target){
	    System.out.print(n+" ");
	    if(n<target){
	        forward(n+5,target);
	    }
	}
}

