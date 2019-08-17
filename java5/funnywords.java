import java.util.*;
public class funnywords{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++){
			if(isFunny(str1[i])){
				System.out.println(str1[i]);
			}
		}
	}
	public static boolean isFunny(String str1){
		char[] str=str1.toCharArray();
		int i=0,j=str1.length()-1;
		while(i<j){
			int n1=Math.abs(str[i]-str[i+1]);
			int n2=Math.abs(str[j]-str[j-1]);
			if(n1!=n2)
				return false;
			i++;
			j--;
		}
		return true;
	}
}