import java.util.*; 
import java.io.*; 

class pogoJump 
{ 
static int validjump(int arr[], int l, int h) 
{ 
		if (h == l) 
		return 0; 

		
		if (arr[l] == 0) 
		return Integer.MAX_VALUE; 

		
		int min = Integer.MAX_VALUE; 
		for (int i = l+1; i <= h && i <= l + arr[l]; i++) 
		{ 
			int jumps = validjump(arr, i, h); 
			if(jumps != Integer.MAX_VALUE && 
			jumps + 1 < min) 
			min = jumps + 1; 
			
		} 
		return min; 
		
} 


public static void main(String args[]) 
{ 
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
		arr[i] =s.nextInt();
        if(validjump(arr, 0, n-1)!=Integer.MAX_VALUE) 
        System.out.print("true");
        else 
        System.out.print("false");
        s.close();
} 
} 


