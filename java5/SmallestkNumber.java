public class SmallestkNumber{
	public static void main(String[] args) {
		String str="1234";
		int n=str.length();
		permute(str,0,n-1);
	}
	public static void permute(String str,int l,int r){
		if(l==r){
			System.out.println(str);
		}else{
			for(int i=l;i<=r;i++){
				str=swap(str,i,l);
				permute(str,l+1,r);
				str=swap(str,i,l);
			}
		}
	}
	public static String swap(String str,int n1,int n2){
		char[] ch=str.toCharArray();
		char temp=ch[n1];
		ch[n1]=ch[n2];
		ch[n2]=temp;
		return new String(ch);
	}
}