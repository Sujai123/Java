/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ChessKnight {
    public static void main(String[] args){
        int[][] board=new int[8][8];
        Scanner s=new Scanner(System.in);
        int knight=s.nextInt();
        for(int k=0;k<knight;k++){
            int i=s.nextInt();
            int j=s.nextInt();
            //board[n1][n2]=2;
            if((i>=2)&&(j<=6)){
           board[i-2][j+1]=1;
        }
        if((i>=2)&&(j>=1))
            board[i-2][j-1]=1;
        if((i>=1)&&(j<=5))
            board[i-1][j+2]=1;
        if((i<=6)&&(j<=5))
            board[i+1][j+2]=1;
        if((i<=5)&&(j<=6))
            board[i+2][j+1]=1;
        if((i<=5)&&(j>=1))
            board[i+2][j-1]=1;
        if((i<=6)&&(j>=2))
            board[i+1][j-2]=1;
        if((i>=1)&&(j>=2))
            board[i-1][j-2]=1;
        }
        int count=0;
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j]==0)
                        count++;
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println(count);
            int x=s.nextInt();
            int y=s.nextInt();
            
    }
    public static int[][] attack(int board[][],int i,int j){
        if((i>=2)&&(j<=6)){
           board[i-2][j+1]=1;
        }
        if((i>=2)&&(j>=1))
            board[i-2][j-1]=1;
        if((i>=1)&&(j<=5))
            board[i-1][j+2]=1;
        if((i<=6)&&(j<=5))
            board[i+1][j+2]=1;
        if((i<=5)&&(j<=6))
            board[i+2][j+1]=1;
        if((i<=5)&&(j>=1))
            board[i+2][j-1]=1;
        if((i<=6)&&(j>=2))
            board[i+1][j-2]=1;
        if((i>=1)&&(j>=2))
            board[i-1][j-2]=1;
    
        return board;
    }
    
}
