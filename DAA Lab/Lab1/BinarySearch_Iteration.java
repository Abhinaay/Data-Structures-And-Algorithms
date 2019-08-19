import java.util.Scanner;

public class BinarySearch_Iteration 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		int arr[]= {2,3,5,6,8,21,45,68};
		System.out.println("Enter a number to search: ");
		int num=sc.nextInt();
		int res=binarySearch(arr,arr.length-1,num);
		if(res==-1)
			System.out.println("Not Found");
		else
			System.out.println("Position : "+res);
		
	}
	private static int binarySearch(int arr[], int n, int x)
	{
		int start=0;
		int end=n-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
}
