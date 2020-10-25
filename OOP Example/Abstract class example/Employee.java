abstract class Employee
{
	String name;
	double netSalary, hraPerc, salary;
	public Employee(String n, int hra, int sal)
	{
		name = n;
		hraPerc = hra;
		salary = sal;
	}
	void compute()
	{
		netSalary = (hraPerc/100.0*salary) + salary;
	}
	abstract void display();
}