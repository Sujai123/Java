import java.util.*;
public class OddfirstEvenLast{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		//char[] ch=str.toCharArray();
		for(int i=1;i<=str.length()/2;i++){
			str=str.substring(0,i)+str.substring(i+1)+str.charAt(i);
		//	System.out.println(str);
		}
		System.out.println(str);
	}
}