import java.util.*;

public class SubArraySum0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        int[] n = new int[tc];
        int[][] a = new int[tc][];
        for(int I = 0; I < tc; I++){
            n[I] = s.nextInt();
            a[I] = new int[n[I]];
            for(int i = 0; i < n[I]; i++){
                a[I][i] = s.nextInt(); 
            }
        }
        for(int I = 0; I < tc; I++){
            int[] tempArr=a[I];
            int l = tempArr.length;
            boolean flg=false;
            for(int i = 0; i < l; i++){
                for(int j = i; j < l; j++){
                    int sum = findSum(tempArr,i,j);
                    if(sum==0){
                        flg=true;
                        break;
                    }
                }
                if(flg)
                break;
            }
            if(flg)
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
    public static int findSum(int[] arr, int i, int j){
        int sum=0;
        for(int k=i;k<=j;k++){
            sum+=arr[k];
        }
        return sum;
    }
}