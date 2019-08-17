import java.util.*;
public class PalindromeSwap{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int n=str.length();
		ArrayList<Count> ar=new ArrayList();
		//int n=ch.length();
		//int i=0;
		for(int i=0;i<str.length();i++){
			
				int l=count(str,str.charAt(i));
				ar.add(new Count(str.charAt(i),l));
				//str=str.replace(Character.toString(str.charAt(i)),"");
				
		}
		boolean flg=true;
		for(Count c:ar){
			if(c.count%2!=0){
				flg=false;
				break;
			}
		}	
		//System.out.println(flg);
		if(flg&&n%2==0)
			System.out.println(flg);
		else if(!(flg)&&n%2==1)
			System.out.println("true");
		else
			System.out.println("false");

	}
	public static int count(String str,char temp){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==temp){
				count++;
			}
		}
		return count;
	}	
}
class Count{
	char ch;
	int count;
	Count(char ch,int count){
		this.ch=ch;
		this.count=count;
	}
}
