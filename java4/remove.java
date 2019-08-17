import java.util.*;
public class remove{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		int n=str2.length();
		String res="";
		for(int i=0;i<n;i++){
			if(isPresent(str2.charAt(i),str1)){
				res+=str2.charAt(i);
			}
		}
		System.out.println(res);
	}
	public static boolean isPresent(char ch,String str){
		for(int i=0;i<str.length();i++){
			if(ch==str.charAt(i))
				return false;
		}
		return true;
	}
}