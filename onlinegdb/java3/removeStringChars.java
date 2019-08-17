import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		String[] str1=new String[tc];
		String[] str2=new String[tc];
		for(int j=0;j<tc;j++){
		str1[j]=s.next();
		str2[j]=s.next();
		}
		for(int j=0;j<tc;j++){
		int n=str2[j].length();
		String res="";
		for(int i=0;i<n;i++){
			if(isPresent(str2[j].charAt(i),str1[j])){
				res+=str2[j].charAt(i);
			}
		}
		System.out.println(res);
		}
	}
	public static boolean isPresent(char ch,String str){
		for(int i=0;i<str.length();i++){
			if(ch==str.charAt(i))
				return false;
		}
		return true;
	}
}

