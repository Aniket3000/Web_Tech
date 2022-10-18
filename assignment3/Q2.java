package assignment3;

public class Q2 {
	public static void main(String[] args) 
	{
		int size=20;
		int freq_array[]=new int[size];
		for(int i=0;i<size;i++)
		{
			freq_array[i]=0;
		}
		int input_array[]= {1, 12, 3, 2, 11, 5, 6, 18, 3, 14, 5, 16, 3, 6, 17};
		System.out.print("Input array: { ");
		for(int i=0;i<input_array.length;i++)
		{
			if(i==input_array.length-1)
			{
				System.out.print(input_array[i]+" }");
			}
			else
			{
				System.out.print(input_array[i]+", ");
			}
			freq_array[input_array[i]]++;
		}
		int index=0;
		for(int i=0;i<size;i++)
		{
			while(freq_array[i]!=0)
			{
				input_array[index]=i;
				index++;
				freq_array[i]--;
			}
		}
		System.out.print("\nSorted array: { ");
		for(int i=0;i<input_array.length;i++)
		{
			if(i==input_array.length-1)
			{
				System.out.print(input_array[i]+" }");
			}
			else
			{
				System.out.print(input_array[i]+", ");
			}
		}
		
		
	}
}
