/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

/**
 *
 * @author HP
 */
public class ArrayRotation {
    public static void main(String[] args){
        int[][]arr={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        int top=0,left=0;
        int right=arr[0].length;
        int down=arr.length;
        int temp=0,temp1=0;
        for (int[] a : arr) {
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
        while(top<(down)&&left<(right)){
            //System.out.println(top+" "+down+" "+left+" "+right);
            temp=arr[top][left];
            for(int i=left;i<right-1;i++)
                arr[top][i]=arr[top][i+1];
            top++;
            temp1=arr[down-1][left];
            for(int i=down-2;i>=top;i--)
                arr[i+1][left]=arr[i][left];
            if(top<down&&left<right)
                arr[top][left]=temp;
            left++;
            //temp1=temp;
            temp=arr[down-1][right-1];
            for(int i=right-2;i>=left;i--)
              arr[down-1][i+1]=arr[down-1][i];
            if(top<down&&left<right)
                arr[down-1][left]=temp1;
            down--;
            temp1=arr[top][right-1];
            for(int i=top;i<down-1;i++)
                arr[i][right-1]=arr[i+1][right-1];
            //if(top<down&&left<right)
                arr[down-1][right-1]=temp;
            if(top<down&&left<right)
                arr[top-1][right-1]=temp1;
            right--;
            
        }
        for (int[] a : arr) {
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
