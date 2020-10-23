/*
Write a program in java to create a „complex‟ class and perform
the addition, subtraction and multiplication of two complex
numbers is of the form (A1+iB1) and (A2+iB2) respectively.
*/

import java.util.*;
public class Complex
{
	int a,b;
	Complex()
	{
		a = 0;
		b = 0;
	}
	Complex(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	Complex add(Complex C1, Complex C2)
	{
		Complex sum = new Complex();
		
		sum.a = C1.a + C2.b;
		sum.b = C1.b + C2.b;
		
		return sum;
	}
	Complex substract(Complex C1, Complex C2)
	{
		Complex sub = new Complex();
		
		sub.a = C1.a - C1.b;
		sub.b  = C1.b - C2.b;
		
		return sub;
	}
	Complex multiply(Complex C1, Complex C2)
	{
		Complex mul = new Complex();
		
		mul.a = (C1.a * C2.b) - (C1.b * C2.b);
		mul.b = (C1.a * C2.b) + (C1.b * C2.a);
		
		return mul;
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details for complex number::");
		System.out.print("enter a ::");
		this.a = sc.nextInt();
		
		System.out.print("enter b ::");
		this.b = sc.nextInt();		
	}
	void display()
	{
		System.out.println("C("+a+", "+b+")");
	}
	public static void main(String args[])
	{
		Complex C1 = new Complex();
		Complex C2 = new Complex();
		
		C1.input();
		C2.input();
		
		Complex add = C1.add(C1,C2);
		Complex sub = C1.substract(C1,C2);
		Complex pro = C1.multiply(C1,C2);
		
		System.out.print("C1 + C2 = ");
		add.display();
		
		System.out.print("C1 - C2 = ");
		sub.display();

		System.out.print("C1 * C2 = ");
		pro.display();		
	}
}
