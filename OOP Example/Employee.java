/*
Write a program in java with class Employee and do the following
operations on it
a) Create two constructor default and with Object as parameter to
initialize class variables.
b) Create a function Calculate which calculates the pf and
allowances on the salary of employee and return the all values as
an object.
*/

import java.util.*;

public class Employee
{
	String name;
	Banking b;
	
	Employee()
	{
		name = "No Name";
		b = new Banking(10000);
	}
	Employee(String n,Banking bank)
	{
		name = n;
		b = bank;
	}
	Banking calculate()
	{
		b.hra = 10.0/100.0 * b.salary;
		b.pf = 5.0/100.0 * b.pf;
		
		b.gp = b.hra + b.pf;
		
		return b;
	}
	public static void main(String args[])
	{
		Employee e = new Employee("Phenix", new Banking(50000));
		Banking b = e.calculate();
		
		b.display();
	}
}

class Banking
{
	double salary, gp, pf, hra;
	Banking(int sal)
	{
		salary = sal;
	}
	void display()
	{
		System.out.println("salary ::"+salary);
		System.out.println("gross pay ::"+gp);
		System.out.println("provident fund ::"+pf);
		System.out.println("house rent allowance ::"+hra);
	}
}