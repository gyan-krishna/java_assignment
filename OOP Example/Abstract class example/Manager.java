public class Manager extends Employee
{
	Manager(String n)
	{
		super(n,10,20000);
	}
	void display()
	{
		System.out.println("Manager :: "+name+" Salary = "+netSalary);
	}
}