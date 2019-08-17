import java.util.*;
public class FormPalindrome1{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] str1=str.toCharArray();
		int n=str.length();
		ArrayList<MyList> ar=new ArrayList();
		for(int i=0;i<n;i++){
			int count=1;
			for(int j=i+1;j<n;j++){
				if(str1[i]==str1[j]){
					count++;
					str1[j]=' ';
				}
			}
			if(str1[i]!=' '){
				ar.add(new MyList(str1[i],count));
			}
		}
		int index=0;
		String first="",last="";
		for(int j=0;j<ar.size();j++){
			MyList temp=ar.get(j);
			if(temp.count%2==1){
				index=j;
				for(int i=0;i<temp.count;i++){
					last+=temp.ch;
				}
			}
		}
		for(int i=0;i<ar.size();i++){
			if(i!=index||str.length()%2==0){
				MyList temp=ar.get(i);
				for(int j=0;j<temp.count;j+=2){
					first=temp.ch+first;
					last+=temp.ch;
				}
			}
		}
		System.out.println(first+last);
	}
}
class MyList{
	char ch;
	int count;
	MyList(char ch,int count){
		this.ch=ch;
		this.count=count;
	}
	public String toString(){
		return this.ch+" "+this.count;
	}
}