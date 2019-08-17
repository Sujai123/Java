
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class arrayfrequency {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        int[] n=new int[tc];
        int[][] a=new int[tc][];
        for(int i=0;i<tc;i++){
        n[i]=s.nextInt();
        a[i]=new int[n[i]];
        //int[] a={5,5,4,6,4};
        for(int j=0;j<n[i];j++){
            a[i][j]=s.nextInt();
        }
        }
        for(int k=0;k<tc;k++){
        Arrays.sort(a[k]);
        int count=0;
        int[] b=new int[a[k].length];
        for(int i=0;i<a[k].length;i++){
            for(int j=0;j<a[k].length;j++){
                if(a[k][i]==a[k][j])
                    count++;
            }
            b[i]=count;
            count=0;
        }
        //    System.out.println("h");
        //int max=0,index=0;
        for(int i=0;i<b.length;i++){
            //index=i;
            for(int j=i+1;j<b.length;j++){
                if(b[i]<b[j]){
                    int temp=a[k][i];
                    int temp1=b[i];
                    a[k][i]=a[k][j];
                    b[i]=b[j];
                    a[k][j]=temp;
                    b[j]=temp1;
                }
                if(b[i]==b[j]){
                    if(a[k][i]>a[k][j]){
                    int temp=a[k][i];
                    a[k][i]=a[k][j];
                    a[k][j]=temp;
                    
                }
                }
            }
//            System.out.println(b[index]+" "+a[k][index]);
//            index=0;
//            max=0;
        }
        for(int i=0;i<b.length;i++){
            System.out.print(a[k][i]+" ");
        }
}
}
    }


