import java.util.*;
public class SpartaPersia{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] str={
			"H...E...H...C..A...h...c....a....$",
			"H......h.....$",
			"G.XE...H....c..h..e....h.Xc....a....$",
			"H...E...H.XC..A.."
		};
		int point=0;
		for(int i=0;i<str.length;i++){
			point+=calculatePoints(str[i]);
		}
		System.out.println(point);
		if(point<0)
			System.out.println("Spartan");
		else if(point>0)
			System.out.println("Persia");
		else
			System.out.println("draw");
	}
	public static int calculatePoints(String str){
		HashMap<Character,Integer> map=new HashMap();
		HashMap<Character,Integer> map1=new HashMap();
		int index=findSmall(str);
		for(int i=0;i<index;){
			char ch=str.charAt(i);
			int point=0;
			int j=i+1;
			// System.out.println(ch+""+str+""+j);
			while(str.charAt(j)=='.'||str.charAt(j)=='X'){
				if(str.charAt(j)=='.')
					point++;
				if(str.charAt(j)=='X')
					point+=2;
				j++;
			}
			i=j;
			int p=power(ch)*point;
			if(map.containsKey(ch)){
				p=p+map.get(ch);
			}
			map.put(ch,p);
			// System.out.println(p);
		}
		for(int i=index;i<str.length()-1;){
			char ch=str.charAt(i);
			int point=0;
			int j=i+1;
			// System.out.println(ch+""+str+""+j);
			while(str.charAt(j)=='.'||str.charAt(j)=='X'){
				if(str.charAt(j)=='.')
					point++;
				if(str.charAt(j)=='X')
					point+=2;
				j++;
				if(j==str.length())
					break;
			}
			i=j;
			int p=power(ch)*point;
			if(map1.containsKey(ch)){
				p=p+map1.get(ch);
			}
			map1.put(ch,p);
		}
		Set<Character> sp1=map.keySet();
		int win1=0,win2=0;
		Iterator itr=sp1.iterator();
		while(itr.hasNext()){
			int temp=map.get(itr.next());
			win1+=temp;
		}
		
		Set<Character> per=map1.keySet();
		Iterator itr1=per.iterator();
		while(itr1.hasNext()){
			int temp=map1.get(itr1.next());
			win2+=temp;
		}
		System.out.println(win1+" "+win2);
		if(win1>win2)
			return 1;
		else
			return -1;
		// System.out.println(map+"\n"+map1);
		// return 1;
	}
	public static int findSmall(String str){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')
				return i;
		}
		return 0;
	}
	public static int power(char ch){
		if(ch=='H'||ch=='h')
			return 5;
		if(ch=='E'||ch=='e')
			return 10;
		if(ch=='A'||ch=='a')
			return 3;
		if(ch=='C'||ch=='c')
			return 1;
		return 0;
	}
}