import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        int[] n = new int[tc];
        int[] k = new int[tc];
        int[][] arr=new int[tc][];
        for(int I = 0; I < tc; I++) {
            n[I] = s.nextInt();
            k[I] = s.nextInt();
            arr[I] = new int[n[I]];
            for(int i = 0; i < n[I]; i++){
                arr[I][i]=s.nextInt();
            }
        }
        for(int I = 0; I < tc; I++){
            int l=n[I];
            int r=k[I];
            int[] tempArr=arr[I];
            while(r != 0){
                int temp = tempArr[0];
                for(int i = 1; i < l; i++) {
                    tempArr[i-1]=tempArr[i];
                }
                tempArr[l-1]=temp;
                r--;
            }
        }
        for(int I = 0; I < tc; I++){
            for(int i=0;i<arr[I].length;i++){
                System.out.print(arr[I][i]+" ");
            }
            System.out.println();
        }
    }
}