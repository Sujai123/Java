import java.util.*;
public class Stringarrange{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		in=new Scanner(System.in);

		int tc=in.nextInt();
		in=new Scanner(System.in);

		String[] str2=new String[tc];
		for(int i=0;i<tc;i++)
		str2[i]=in.next();
		String[] sp=str1.split(" ");
		
		for(int m=0;m<tc;m++){
			String res="";
		for(int i=0;i<str2[m].length();i++){
			for(int j=0;j<sp.length;j++){
				if(sp[j].charAt(0)==str2[m].charAt(i)){
					res+=sp[j]+" ";
				}
			}
		}
		for(int i=0;i<sp.length;i++){
			if(!(res.contains(sp[i])))
				res+=sp[i];
		}
		System.out.println(res);
		}	
	}
}