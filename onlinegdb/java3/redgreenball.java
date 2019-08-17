import java.util.*;
public class Main
{   
    static int count=0,min=999;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int[] grid=new int[n];
        char[][] grid={
        {'G','R','R'},
        {'R','R','G'},
        {'R','G','G'},
        };
        for(int i=0;i<grid.length;i++)
        System.out.println(Arrays.toString(grid[i]));;
        // char[] temp=grid[0];
        // grid[0]=grid[1];
        // grid[1]=temp;
        // for(int i=0;i<grid.length;i++)
        // System.out.println(Arrays.toString(grid[i]));;
        if(isValid(grid))
        System.out.println("true");
        swap(grid,0);
        System.out.println(true);
        for(int i=0;i<grid.length;i++)
        System.out.println(Arrays.toString(grid[i]));
        System.out.println(min);
        
    }
    public static void swap(char[][] grid,int k){
      if(isValid(grid)){
          System.out.println(count);
          System.out.println();
          if(count<min)
          min=count;
        
      }
        for(int i=k;i<grid.length;i++){
        char[] temp=grid[i];
        grid[i]=grid[k];
        grid[k]=temp;
        // for(int j=0;j<grid.length;j++)
        // System.out.println(Arrays.toString(grid[j]));;
        // System.out.println();
        count+=(i-k);
        // System.out.println(count);
        swap(grid,k+1);
        count-=(i-k);
        char[] temp1=grid[i];
        grid[i]=grid[k];
        grid[k]=temp1;
        }
    }
    public static boolean isValid(char[][] grid){
        int n1=grid.length;
        int n2=grid[0].length;
        for(int i=0;i<n1;i++){
            for(int j=i+1;j<n2;j++){
                if(grid[i][j]=='R')
                return false;
            }
        }
        return true;
    } 
}

