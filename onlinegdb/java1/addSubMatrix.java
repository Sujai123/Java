
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		int n1[]=new int[tc];
		int n2[]=new int [tc];
		int[][][] a=new int[tc][][];
		int[] x1=new int[tc];
		int[] y1=new int[tc];
		int[] x2=new int[tc];
		int[] y2=new int[tc];
		for(int i=0;i<tc;i++){
		    n1[i]=s.nextInt();
		    n2[i]=s.nextInt();
		    a[i]=new int[n1[i]][n2[i]];
		    for(int k=0;k<n1[i];k++){
		        for(int j=0;j<n2[i];j++){
		            a[i][k][j]=s.nextInt();
		        }
		    }
		    x1[i]=s.nextInt()-1;
		    y1[i]=s.nextInt()-1;
		    x2[i]=s.nextInt()-1;
		    y2[i]=s.nextInt()-1;
		}
		
		for(int i=0;i<tc;i++){
		  int sum=0;
		    for(int j=x1[i];j<=x2[i];j++){
		        for(int k=0;k<a[i][0].length;k++){
		            sum+=a[i][j][k];
                            System.out.println(a[i][j][k]);
		        }
		    }
                    //System.out.println(sum);
                    for(int j=0;j<=y1[i];j++){
                        sum-=a[i][x1[i]][j];
                        System.out.println(a[i][x1[i]][j]);
                    }
                    for(int j=y2[i];j<a[i][0].length;j++){
                        sum-=a[i][x2[i]][j];
                        System.out.println(a[i][x2[i]][j]);
                    }
		    System.out.println(sum);
		}
	}
}





