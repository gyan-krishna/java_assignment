/*
Write a program in java to create Box class with parameterized
constructor with an object argument to initialize length, breadth
and height also create a function volume which returns the volume
of the box and print it in main method.
*/

import java.util.*;

public class Box
{
	int length, breadth, height;
	Box()
	{
		length = breadth = height = 0;
	}
	Box(int l, int b, int h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	int volume()
	{
		return (length*breadth*height);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int l, b, h;
		
		System.out.print("Enter length breadth and height :: ");
		l = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		
		Box ob = new Box(l, b, h);
		System.out.println("the volume is :: "+ob.volume());
	}
}