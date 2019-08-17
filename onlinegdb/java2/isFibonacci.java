import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int first=0,second=1,third=0;
		boolean flg=false;
		while(third<n){
		    third=first+second;
		    if(third==n){
		        flg=true;
		        break;
		    }
		    first=second;
		    second=third;
		}
		System.out.println(flg);
	}
}

