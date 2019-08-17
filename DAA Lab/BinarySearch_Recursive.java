import java.util.*;
public class BinarySearch_Recursive 
{	
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		int arr[]= {2,3,5,6,8,21,45,68};
		System.out.println("Enter a number to search: ");
		int num=sc.nextInt();
		int res=binarySearch(arr,0,arr.length-1,num);
		if(res==-1)
			System.out.println("Not Found");
		else
			System.out.println("Position : "+res);
		
	}
	
	public static int binarySearch(int arr[], int low, int high, int x)
	{
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(x==arr[mid])
			return mid;
		else if(x<arr[mid])
			return binarySearch(arr,low,mid-1,x);
		else
			return binarySearch(arr,mid+1,high,x);
	}
}
