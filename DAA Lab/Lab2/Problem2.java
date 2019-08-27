import java.util.Scanner;

public class Problem2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sorted array of 5 elements circularly shifted by k positions: ");
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=getShift(arr,arr.length-1,0);
		System.out.println("k = "+k);
	}
	static int getShift(int[] arr, int max, int min)
	{
		
		int mid=(max+min)/2;
		if(arr[mid]<arr[min])
		{
			max=mid;
			return getShift(arr,max,min);
		}
		if(arr[mid]>arr[min])
		{
			min=mid;
			return getShift(arr,max,min);
		}
		return mid+1;
	}
}
