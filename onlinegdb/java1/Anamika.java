import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a=5;
		int b=4;
		int k=1;
		int count=0;
		int a1=k,b1=0;
		System.out.println(a1+" "+b1);
		if(a>b){
		    count++;
		}
		else{
		while(a1>=b1){
		 count++;
		 a1+=a;
		 b1+=b;
		}
		}
		System.out.println(a1+" "+b1+" "+count);
	}
}

