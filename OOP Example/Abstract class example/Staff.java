public class Staff extends Employee
{
	Staff(String n)
	{
		super(n,5,20000);
	}
	void display()
	{
		System.out.println("Staff :: "+name+" Salary = "+netSalary);
	}
}