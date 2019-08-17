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
		int k=0;
		int[][] b=new int[n][2];
		for(int i=0;i<n;i++){
		    int count=0;
		    for(int j=i+1;j<n;j++){
		        if(a[i]==a[j]){
		            count++;
		        }
		    }
		    b[k][0]=a[i];
		    b[k][1]=count;
		    k++;
		}
		int max=0,index=0;
		for(int i=0;i<k;i++){
		    if(b[i][1]>max){
		        index=i;
		        max=b[i][1];
		    }
		    else if(b[i][1]==max){
		        if(b[i][0]<b[max][0]){
		            index=i;
		        }
		    }
		}
		System.out.println(b[index][0]);
	}
}



