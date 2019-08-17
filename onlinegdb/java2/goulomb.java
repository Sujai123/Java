import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner in=new Scanner(System.in);
		int n=6;
		int k=0,i=2;
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(2);
		while(k<n){
		    int temp=ar.get(i);
		    for(int j=0;j<temp;j++){
		        ar.add(i+1);
		        k++;
		    }
		    i++;
		    System.out.println(ar);
		}
		System.out.println(ar);
	}
}

