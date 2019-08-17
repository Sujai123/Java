/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class chessknight {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String[][] board=new String[12][12];
        int k=s.nextInt();
        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                board[i][j]="";
            }
        }
        for(int m=0;m<k;m++){
            int i=s.nextInt();
            int j=s.nextInt();
            i=i+1;
            j=j+1;
            //board[x+1][y+1]=1;
            board[i-2][j+1]+=Integer.toString(m+1);
        
            board[i-2][j-1]+=Integer.toString(m+1);
        
            board[i-1][j+2]+=Integer.toString(m+1);
        
            board[i+1][j+2]+=Integer.toString(m+1);
       
            board[i+2][j+1]+=Integer.toString(m+1);
        
            board[i+2][j-1]+=Integer.toString(m+1);
        
            board[i+1][j-2]+=Integer.toString(m+1);
        
            board[i-1][j-2]+=Integer.toString(m+1);
          }
        
//        for(int i=2;i<10;i++){
//            for(int j=2;j<10;j++){a
//                if(board[i][j].length()!=0)
//                System.out.print(board[i][j]+"|\t");
//                else
//                    System.out.print("_|\t");
//            }
//            System.out.println();
//        }
//        for(int i=2;i<10;i++){
//            for(int j=2;j<10;j++){
//                if(board[i][j].length()==0)
//                    System.out.println((i-1)+" "+(j-1));
//            }
//        }
        int kx=s.nextInt();
        int ky=s.nextInt();
        board=king(board,kx+1,ky+1);
        for(int i=2;i<10;i++){
            for(int j=2;j<10;j++){
                if(board[i][j].length()!=0)
                System.out.print(board[i][j]+"|\t");
                else
                    System.out.print("_|\t");
            }
            System.out.println();
        }
        //String a="";
        for(int i=kx;i<=kx+2;i++){
            for(int j=ky;j<=ky+2;j++){
                //System.out.println(board[i][j]);
                printKnight(board,i,j);
            }
        }
        
        
        //System.out.println(a);
        
        
        
        
        
        
    }
    public static String[][] king(String[][] board,int x,int y){
        board[x-1][y-1]+="k";
        board[x-1][y]+="k";
        board[x-1][y+1]+="k";
        board[x][y-1]+="k";
        //board[x][y]+="k";
        board[x][y+1]+="k";
        board[x+1][y-1]+="k";
        board[x+1][y]+="k";
        board[x+1][y+1]+="k";
        return board;
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
    public static void printKnight(String[][] board,int i,int j){
        String temp=board[i][j];
        int n=temp.length();
        //System.out.println(temp+" "+a);
        for(int k=0;k<n-1;k++){
            //if(!(a.contains(Character.toString(temp.charAt(k))))){
            System.out.println("Position:"+i+" "+j+" Knight="+temp.charAt(k));
            //a+=temp.charAt(k);
            }
        //}
        //return a;
    }
}

