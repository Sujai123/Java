import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String bin="";
		while(n>0){
		    int digit=n%2;
		    bin=digit+bin;
		    n/=2;
		}
		//System.out.println(bin);
		int n1=bin.indexOf("1");
		int max=0,i=0;
		while(i<bin.length()){
		    int n2=bin.indexOf("1",n1+1);
		    int len=n2-n1-1;
		    if(len>max){
		        max=len;
		    }
		    i++;
		    n1=n2;
		}
		System.out.println(max);
	}
}

