import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		String[] str=new String[tc];
		s=new Scanner(System.in);
		for(int i=0;i<tc;i++){
		    str[i]=s.nextLine();
		}
		for(int i=0;i<tc;i++){
		    reverseString(str[i]);
		}
	}
	public static void reverseString(String str){
	    String[] str1=str.split(" ");
	    String res="";
	    for(int i=0;i<str1.length;i++){
	        res+=reverse(str1[i])+" ";
	    }
	    System.out.println(res.trim());
	}
	public static String reverse(String str){
	    String rev="";
	    for(int i=str.length()-1;i>=0;i--){
	        rev+=str.charAt(i);
	    }
	    return rev;
	}
}

