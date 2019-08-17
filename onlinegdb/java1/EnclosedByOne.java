import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String bin="";
		while(n>0){
		    bin=n%2+bin;
		    n/=2;
		}
		//System.out.println(bin);
		boolean flg=true;
		if(isSet(bin))
		flg=true;
		else
		flg=false;
		System.out.println(flg);
	}
	public static boolean isSet(String bin){
	    for(int i=1;i<bin.length()-1;i++){
	        if(bin.charAt(i)=='1')
	        return false;
	    }
	    return true;
	}
}

