import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=s.nextInt();
		}
		int min=999;
		int max=-999;
		for(int temp:a){
		    if(temp>max)
		    max=temp;
		    if(temp<min)
		    min=temp;
		}
		System.out.println(max-min);
	}
}

