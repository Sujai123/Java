import java.util.Scanner;

public class PogoJump1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = s.nextInt();
            y[i] = s.nextInt();
        }
        boolean flg = true;
        for(int i=0;i<n-1;i++){
            if((x[i]+1==x[i+1]&&y[i]+1==y[i+1])||
            (x[i]==x[i+1]&&y[i]+1==y[i+1])||
            (x[i]+1==x[i+1]&&y[i]==y[i+1])||
            (x[i]==x[i+1]&&y[i]==y[i+1])||
            (x[i]-1==x[i+1]&&y[i]-1==y[i+1])||
            (x[i]-1==x[i+1]&&y[i]==y[i+1])||
            (x[i]==x[i+1]&&y[i]-1==y[i+1])){
                flg=true;
            }else{
                flg=false;
                break;
            }
        }
        System.out.println(flg);
    }
}