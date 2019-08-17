import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int low=s.nextInt();
		int high=s.nextInt();
		int k=s.nextInt();
		int count=0;
		for(int i=low;i<=high;i++){
		    if(i%k==0)
		    count++;
		}
		System.out.println(count);
	}
}

