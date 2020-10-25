/*
Create a class Student with following operations
a) create parameterized constructor to initialize the objects.
b) create a function isEqual() to check whether the two objects
are equal or not which returns the Boolean value and gets two
objects.
c) print the result in main method if objects are equals or not (take
variables as your assumption)
*/

import java.util.*;

public class Student
{
	String name;
	int rollNo;
	
	Student(String n, int r)
	{
		name = n;
		rollNo = r;
	}
	boolean isEqual(Student s)
	{
		if(this.name.equals(s.name) && this.rollNo == s.rollNo)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String n1,n2;
		int r1,r2;
		
		System.out.println("Enter first student details :: ");
		n1 = sc.nextLine();
		r1 = sc.nextInt();
		
		sc.nextLine();//extra string i/p to flush out enter left by sc.nextInt()
		
		System.out.println("Enter second student details :: ");
		n2 = sc.nextLine();
		r2 = sc.nextInt();		
		
		Student s1 = new Student(n1,r1);
		Student s2 = new Student(n2,r2);
		
		System.out.println(s1.isEqual(s2));
	}
}