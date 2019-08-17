import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=s.nextInt();
		}
		int res=-1;
		for(int i=0;i<n/2;i++){
		    int count=1;
		    for(int j=i+1;j<n;j++){
		        if(a[i]==a[j]){
		            count++;
		        }
		    }
		    if(count>n/2){
		        //System.out.println(a[i]);
		        res=a[i];
		        break;
		    }
		}
		System.out.println(res);
	}
}

