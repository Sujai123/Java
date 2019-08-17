import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int prime=n;
		for(int i=n/2;i>1;i--){
		    if(isPrime(i)&&n%i==0){
		        prime=i;
		        break;
		    }
		}
		System.out.println(prime);
	}
	public static boolean isPrime(int n){
	    for(int i=2;i<=n/2;i++){
	        if(n%i==0)
	        return false;
	    }
	    return true;
	}
}

