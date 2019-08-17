import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		s=new Scanner(System.in);
		//int n[]=new int[tc];
		//char[][] ch=new char[tc][];
		String[] str=new String[tc];
		for(int i=0;i<tc;i++){
		    //n[i]=s.nextInt();
		    //ch[i]=new char[n[i]];
		    //for(int j=0;j<n[i];j++){
		      //  ch[i][j]=s.next().charAt(0);
		    //}
		    str[i]=s.nextLine();
		}
		for(int i=0;i<tc;i++){
		    //String str=new String(ch[i]);
		    int n=endOne(str[i]);
		    System.out.println(n);
		}
	}
	public static int endOne(String str){
	    int n=str.length();
	    int count=0;
	    for(int i=0;i<n;i++){
	        if(str.charAt(i)=='1'){
	            count+=strcount(str,i+1);
	        }
	    }
	    return count;
	}
	public static int strcount(String str,int k){
	    int count=0;
	    for(int i=k;i<str.length();i++){
	        if(str.charAt(i)=='1')
	        count++;
	    }
	    return count;
	}
}

