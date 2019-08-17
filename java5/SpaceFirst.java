import java.util.*;
public class SpaceFirst{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char[] ch=str.toCharArray();
		int k=0;
		String res="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]==' '){
				res+=" ";
				k=i+1;
				str=str.replaceFirst(" ","");
				
			}
		}
		res+=str;
		System.out.println(res);
	}
}