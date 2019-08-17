import java.util.*;
public class ArrayRotation{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt(),n2=in.nextInt();
		int[][] a=new int[n1][n2];
		// int[][] a={
		// 	{1,2,3},
		// 	{4,5,6},
		// 	{7,8,9}
		// };
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int top=0;
		int down=n1-1;
		int left=0;
		int right=n2-1;
		while(top<down&&left<right){
			int temp=a[top][left];
			for(int i=left;i<right;i++){
				a[top][i]=a[top][i+1];
			}
			a[top][right]=a[top+1][right];
			for(int i=top+1;i<right;i++){
				a[i][right]=a[i+1][right];
			}
			a[down][right]=a[down][right-1];
			for(int i=right-1;i>left;i--){
				a[down][i]=a[down][i-1];
			}
			a[down][left]=a[down-1][left];
			for(int i=down-1;i>top;i--){
				a[i][left]=a[i-1][left];
			}
			a[top+1][left]=temp;
			top++;
			left++;
			down--;
			right--;
		}
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}