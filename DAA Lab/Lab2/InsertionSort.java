
public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] A= {21,3,31,44,32};
		int[] sorted=insertionSort(A);
		
		for(int i=0;i<sorted.length;i++)
		{
			System.out.println(sorted[i]);
		}
	}
	static int[] insertionSort(int[] A)
	{
		for(int i=1;i<A.length;i++)
		{
			int key=A[i];
			int j=i-1;
			while(j>=0 && A[j]>key)
			{
				A[j+1]=A[j];
				j--;
			}
			A[j+1]=key;
		}
		
		return A;
	}
}
