import java.util.*;
public class FormPalindrome{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char[] ch=str.toCharArray();
		int n=str.length();
		int i=0,j=n-1;
		if(n%2==0){
		while(i<j){
			if(ch[i]==ch[j]){
				i++;
				j--;
			}else if(ch[i]!=ch[j]){
				for (int k=i+1;k<j;k++){
					if(ch[k]==ch[j]){
						char temp=ch[k];
						ch[k]=ch[i];
						ch[i]=temp;
						break;
					}
				}
				i++;
				j--; 
			}
		} 
	}else{
		int pivot=(n-1)/2;
		while(i<j){
			if(ch[i]==ch[j]){
				i++;
				j--;
			}else if(ch[pivot]==ch[j]){
				char temp=ch[pivot];
				ch[pivot]=ch[i];
				ch[i]=temp;
				i++;
				j--; 
			}
			else if(ch[pivot]==ch[i]){
				char temp=ch[pivot];
				ch[pivot]=ch[j];
				ch[j]=temp;
				i++;
				j--; 
			}
			else{
				for (int k=i+1;k<j;k++){
					if(ch[k]==ch[j]){
						char temp=ch[pivot];
						ch[pivot]=ch[i];
						ch[i]=temp;
						break;
					}
				}
			}
		}
	}
		str=new String(ch);
		System.out.println(str);
	}

}