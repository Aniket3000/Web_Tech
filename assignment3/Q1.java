package assignment3;

public class Q1 {
	public static void main(String[] args) 
	{
		String first=new String("alpha");
		String second =new String("betac");
		int compare=first.compareTo(second);
		if(compare<0)
		{
			System.out.println("Lexicographically smaller string:"+first);
		}
		else if(compare>0)
		{
			System.out.println("Lexicographically smaller string:"+second);
		}
		else
		{
			System.out.println("Both strings are same.");
		}
		
	}
}