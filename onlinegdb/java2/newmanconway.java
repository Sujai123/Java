import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n=10;
	    System.out.println(newman(10));
	}
	public static int newman(int k){
	    if(k==2||k==1||k==0)
	    return 1;
	    int temp=newman(newman(k-1))+newman(k-newman(k-1));
	    return temp;
	}
}

