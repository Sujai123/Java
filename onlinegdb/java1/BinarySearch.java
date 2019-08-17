import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {3,4,2,6,7,4,5,9,1,0};
		Arrays.sort(arr);
		int search=2,res=-1;
		System.out.println(Arrays.toString(arr));
		int low=0,high=arr.length-1;
		while(low<=high){
		    int mid=(low+high)/2;
		    if(arr[mid]==search){
		        res=mid;
		        break;
		    }
		    else if(arr[mid]>search){
		        high=mid-1;
		    }
		    else if(arr[mid]<search){
		        low=mid+1;
		    }
		}
		System.out.println(res);
	}
}

