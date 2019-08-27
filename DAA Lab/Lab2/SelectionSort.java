
public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] A= {2,32,45,31,56,3};
		int[] sorted=selectionSort(A);
		
		for(int i=0;i<sorted.length;i++)
		{
			System.out.print(sorted[i]+" ");
		}
	}
	static int[] selectionSort(int[] A)
	{
		int min=0;
		int temp=0;
		for(int i=0;i<A.length-1;i++)
		{
			min=i;
			for(int j=i+1;j<A.length;j++)
			{
				if(A[j]<A[min])
				{
					min=j;
				}
			}
			temp=A[min];
			A[min]=A[i];
			A[i]=temp;
		}
		return A;
	}

}
