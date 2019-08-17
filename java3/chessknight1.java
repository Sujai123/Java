
package Sample;
import java.util.Scanner;
public class chessknight1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[][] board=new int[12][12];
        int k=s.nextInt();
        for(int m=0;m<k;m++){
            int i=s.nextInt();
            int j=s.nextInt();
            i=i+1;
            j=j+1;
            //board[x+1][y+1]=1;
            board[i-2][j+1]+=(int) Math.pow(2,m);
        
            board[i-2][j-1]+=(int) Math.pow(2,m);
        
            board[i-1][j+2]+=(int) Math.pow(2,m);
        
            board[i+1][j+2]+=(int) Math.pow(2,m);
       
            board[i+2][j+1]+=(int) Math.pow(2,m);
        
            board[i+2][j-1]+=(int) Math.pow(2,m);
        
            board[i+1][j-2]+=(int) Math.pow(2,m);
        
            board[i-1][j-2]+=(int) Math.pow(2,m);
          }
        
//        for(int i=2;i<10;i++){
//            for(int j=2;j<10;j++){
//                if(board[i][j]==1||board[i][j]==3){
//                    board=knightplace(board,i,j);
//                }
//            }
//        }
        for(int i=2;i<10;i++){
            for(int j=2;j<10;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
//        for(int i=2;i<10;i++){
//            for(int j=2;j<10;j++){
//                if(board[i][j]==0)
//                    System.out.println((i-1)+" "+(j-1));
//            }
//        }
//            for(int i=2;i<10;i++){
//                for(int j=2;j<10;j++){
//                    if(board[i][j]!=0){
//                        printKnight(board,i,j);
//                    }
//                }
//            }
        
    }
    public static int[][] knightplace(int[][] board,int i,int j){
        
           board[i-2][j+1]+=Math.pow(2,board[i][j]);
        
            board[i-2][j-1]+=Math.pow(2,board[i][j]);
        
            board[i-1][j+2]+=Math.pow(2,board[i][j]);
        
            board[i+1][j+2]+=Math.pow(2,board[i][j]);
       
            board[i+2][j+1]+=Math.pow(2,board[i][j]);
        
            board[i+2][j-1]+=Math.pow(2,board[i][j]);
        
            board[i+1][j-2]+=Math.pow(2,board[i][j]);
        
            board[i-1][j-2]+=Math.pow(2,board[i][j]);
            return board;
    }
    public static void printKnight(int[][] board,int i,int j){
        int n=board[i][j];
        String str="";
        while(n!=0){
            str+=n%2;
            n/=2;
        }
        System.out.print(i+" "+j+" "+str);
        for(int k=0;k<=str.length()-1;k++){
            if(str.charAt(k)=='1'){
                System.out.println(" k"+k);
            }
        }
    }
}
