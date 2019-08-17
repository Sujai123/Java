import java.util.*;
public class ReverseWord{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
			String str=in.nextLine();
			int n=in.nextInt();
			String[] sp=str.split(" ");
			String res="";
			for(int j=0;j<sp.length;j++){
				if(j==n-1){
			for(int i=sp[n-1].length()-1;i>=0;i--){
				res+=sp[n-1].charAt(i);
			}
			res+=" ";
		}else{
			res+=sp[j]+" ";
		}
			
		}
		System.out.println(res);
		}	
}