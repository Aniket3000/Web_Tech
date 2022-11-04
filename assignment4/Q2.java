import java.util.*;

class Employee{
	int yearofjoin;
	String name,address;
	public Employee(int x,String y,String z)
	{
		yearofjoin=x;
		name=y;
		address=z;
	}
}

public class Q2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total number of people in organization:");
		int employee_number=scan.nextInt();
		int yearofjoin;
		String name,address;
		Employee info[]=new Employee[employee_number];
		for(int i=0;i<employee_number;i++)
		{
			System.out.println("Enter the name:");
			name=scan.next();
			System.out.println("Enter the year of joining:");
			yearofjoin=scan.nextInt();
			System.out.println("Enter the address:");
			address=scan.next();
			Employee new_employee=new Employee(yearofjoin,name,address);
			info[i]=new_employee;
			System.out.println();
		}
		System.out.println("Name        Year of joining        Address");
		for (Employee x:info)
		{
			System.out.println(x.name+"        "+x.yearofjoin+"           "+x.address);
		}
		
	}

}
