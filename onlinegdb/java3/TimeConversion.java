import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String res="";
		if(str.contains("PM")){
		    int n=Integer.parseInt(str.substring(0,2));
		    n=n+12;
		    if(n==24)
		    n=0;
		    res+=n+"";
		    res+=str.substring(2,8);
		}else{
		    res=str.substring(0,8);
		}
		System.out.println(res);
	}
}

