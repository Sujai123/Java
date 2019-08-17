import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		s=new Scanner(System.in);
		String[] str1=new String[tc];
		String[] str2=new String[tc];
		for(int i=0;i<tc;i++){
		    str1[i]=s.nextLine();
		    str2[i]=s.nextLine();
		}
		for(int i=0;i<tc;i++){
		    int n=strcompare(str1[i],str2[i]);
		    System.out.println(n);
		}
	}
	public static int strcompare(String str1,String str2){
	    int n=str1.length();
	    int k=0;
	    for(int i=0;i<n;i++){
	        if(str1.charAt(i)==str2.charAt(k)){
	            k++;
	        }
	        else if(str1.charAt(i)!=str2.charAt(k)){
	            k=0;
	        }
	        if(k==str2.length()){
	            return i-k+1;
	        }
	    }
	    return -1;
	}
}


