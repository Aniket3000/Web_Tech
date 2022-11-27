import java.util.Scanner;

public class ques2 {
	
	public static void addition(int num1, int num2) {
		if(num1 < 0 || num2 < 0) {  
			throw new ArithmeticException("Exception: numbers should be not be negative");
		}
		else {
			int ans = num1 + num2;  
			System.out.println("Addition: " + ans);
		}
	}
	
	public static void subtraction(int num1, int num2) {
		if(num1 < 0 || num2 < 0) {  
			throw new ArithmeticException("Exception: numbers should be not be negative");
		}
		else {
			int ans = num1 - num2;  
			System.out.println("Subtraction: " + ans);
		}
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		try {  
			addition(num1, num2);
			
			subtraction(num1, num2);
		}
		catch(ArithmeticException e) { 
			System.out.println(e);
		}
	}
}
