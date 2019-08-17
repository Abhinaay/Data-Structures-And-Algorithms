
import java.util.*;
public class LinearSearch 
{	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int arr[]= {10,20,2,4,65,78,43,3,32,45,345};
		System.out.println("Enter Number to search: ");
		int num=sc.nextInt();
		int res=linearSearch(arr,num);
		
		if(res==-1)
			System.out.println("Not Found");
		else
			System.out.println("Position :"+res);
		
	}
	public static int linearSearch(int arr[], int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				return i;
			}
			
		}
		return -1;
	}
}
