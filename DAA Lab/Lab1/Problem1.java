import java.util.*;
public class Problem1 
{	
	static Scanner sc=new Scanner(System.in);
	static int[] sub;
	// List for storing lengths of substrings
	static List<Integer> L=new ArrayList<Integer>();
	public static void main(String[] args) 
	{	// given array
		int A[]={1,3,5,7,4,28,23,54};
		//getting value of k from user
		System.out.println("Enter value of k : ");
		int k=sc.nextInt();
		//finding length of array A
		int n=A.length;
		
		// finding the minimum required length
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				// finding a sub-array  
				sub=subArray(A,i,j);
				String str="";
				int count=0;
				
				// Converting sub-array to binary 
				for(int l=0;l<sub.length;l++)
					str+=decToBinary(sub[l]);
				
				// getting number of 1's in binary form of sub-array
				char[] ch=str.toCharArray();
				for(int o=0;o<ch.length;o++)
					if(Character.getNumericValue(ch[o])==1)
						count++;
				
				// comparing count of 1 with k and storing length of sub-array if it is greater or equal
				if(count>=k)
					L.add(sub.length);

				
			}
		}
		
		// sorting list of lengths of sub-arrays
		Collections.sort(L);
		
		// printing result
		System.out.println("Length of required sub string : "+L.get(0));
		
	}
	
	// Method to find sub-array
	public static int[] subArray(int[] array, int beg, int end) {
		return Arrays.copyOfRange(array, beg, end + 1);
	}
	
	// Method to convert decimal to binary
	 static String decToBinary(int n) 
	    { 	         
	        int[] binaryNum = new int[1000]; 
	        int i = 0;
	        String str="";
	        while (n > 0)  
	        { 
	            binaryNum[i] = n % 2; 
	            n = n / 2; 
	            i++; 
	        } 
	   
	        for (int j = i - 1; j >= 0; j--) 
	            str+=binaryNum[j]; 
	        return str;
	    } 

}
