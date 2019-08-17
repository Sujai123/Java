import java.util.*;

public class ArrangeArray{
    static boolean flg=false;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        permute(arr,0);
        
    }
    public static int findLast(int n){
        return n%10;
    }
    public static int findFirst(int n){
        int temp = n, count = 0;
        while(n!=0){
            count++;
            n/=10;
        }
        int k = (int)(Math.pow(10,count-1));
        return (temp/k);
    }
    public static void permute(int[] arr,int k){
        if(flg)
        return;
        if(arr.length==k){
            if(isValid(arr)){
                for(int temp:arr){
                    System.out.print(temp+" ");
                }
                flg=true;
            }
        }
        else  
        {  
            for (int i = k; i < arr.length; i++)  
            {  
                
                swap(arr,k,i);  
                  
                permute(arr,k+1);  
                
                swap(arr,k,i);  
            }  
        }  
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static boolean isValid(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(findLast(arr[i-1])!=findFirst(arr[i]))
            return false;
        }
        return true;
    }
}