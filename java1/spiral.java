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
public class spiral {
    public static void main(String[] args){
        int[][] a={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int top=0,left=0;
        int down=a.length,right=a[0].length;
        while(left<right&&top<down){
        for(int i=left;i<right;i++){
            System.out.print(a[top][i]+" ");
        }
        top++;
        for(int i=top;i<down;i++){
            System.out.print(a[i][right-1]+" ");
        }
        right--;
        for(int i=right-1;i>=left;i--){
            System.out.print(a[down-1][i]+" ");
        }
        down--;
        for(int i=down-1;i>=top;i--){
            System.out.print(a[i][left]+" ");
        }
        left++;
            //System.out.println();
        }
    }
}
