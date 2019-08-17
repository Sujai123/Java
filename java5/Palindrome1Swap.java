import java.util.*;
public class Palindrome1Swap{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		boolean flg=false;
		if(isPalin(str,0,0)){
			flg=true;
		}
		else{
		for(int i=0;i<str.length()-1;i++){
			for(int j=i+1;j<str.length();j++){
				if(isPalin(str,i,j)){
					flg=true;
					break;
				}
			}
		}
	}
		System.out.println(flg);
	}
	public static boolean isPalin(String str,int n1,int n2){
		char[] ch=str.toCharArray();
		char temp=ch[n1];
		ch[n1]=ch[n2];
		ch[n2]=temp;
		for(int i=0;i<ch.length/2;i++){
			if(ch[i]!=ch[ch.length-i-1])
				return false;
		}
		return true;
	}
}