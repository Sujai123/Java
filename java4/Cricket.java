import java.util.*;
public class Cricket{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int[] p=new int[11];
		int st=0;
		int nst=1;
		int total=0,ex=0;
		int k=2;
		int temp;
		int b=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			switch(ch){
				case '1':p[st]+=1;
				total+=1;
				 temp=st;
				st=nst;
				nst=temp;
				b++;
				break;
				case '2':p[st]+=2;
				total+=2;
				b++;
				break;
				case '3':p[st]+=3;
				 temp=st;
				 b++;
				total+=3;
				st=nst;
				nst=temp;
				break;
				case '4':p[st]+=4;
				total+=4;
				b++;
				break;
				case '6':p[st]+=6;
				total+=6;
				b++;
				break;
				case '.':b++;
				break;
				case 'O':b++;
				k++;
				st=k-1;
				break;
				case 'W':ex+=1;
				total+=1;
				break;
			}
			if((b)%6==0&&b!=0){
				 temp=st;
				st=nst;
				nst=temp;
			}
		}
		for(int i=0;i<k;i++){
			System.out.println("P"+(i+1)+"-"+p[i]);
		}
		int n=str.length();
		System.out.println("Strike-P"+(st+1));
		System.out.println("NonStrike-P"+(nst+1));
		System.out.println("Total-"+total);
		System.out.println("Overs-"+b/6+"."+b%6);
		System.out.println("Extra-"+ex);
		System.out.println("Wickets-"+(k-2));
		System.out.println("Remaining Wickets-"+(10-k+2));
	}
}