/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author HP
 */

public class NQueen {
    static int N=8;
   static int[][] arr=new int[N][N];
    public static boolean isSafe(int[][] arr,int m,int n){
        for(int i=0;i<n;i++)
            if(arr[m][i]==1)
                return false;
//        for(int i=m;i>0;i--){
//            for(int j=n;j>0;j--){
//                if(arr[i][j]==1)
//                    return false;
//            }
//        }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(arr[i][j]==1)
//                    return false;
//            }
//        }
//        for(int i=m;i<4;i++){
//        for(int j=n;j>=0;j--){
//            return false;
//        }
//    }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(arr[i][j]==1)
//                    return false;
//            }
//        }
        for(int i=m,j=n;j>=0&&i>=0;i--,j--)
            if(arr[i][j]==1)
                return false;
        for(int i=n,j=m;j<N&&i>=0;i--,j++)
            if(arr[i][j]==1)
                return false;
        return true;
    }
    public static void main(String[] args){
//        int[][] arr=new int[4][4];
        if(nQueenUtil(arr,0))
            System.out.println("true");
        else
            System.out.println("false");
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static boolean nQueenUtil(int[][] arr,int k){
        if(k>=N){
            return true;
        }
        for(int i=0;i<N;i++){
            
            if(isSafe(arr,i,k)){
                System.out.println("1");
                    arr[i][k]=1;
                    if(nQueenUtil(arr,k+1))
                        return true;
                    arr[i][k]=0;
            }
        }
        return false;
    }
}
