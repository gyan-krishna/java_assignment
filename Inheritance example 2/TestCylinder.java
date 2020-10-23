/*
Create a base class „Square‟ having instance variable side:double.
Initiate variable using constructor, a method „getVolume() :
double‟ that calculates volume and print it. Create a derived class
„Cylinder‟ having instance variable height:double. Initiate
variables of both classes through constructor, override method
„getVolume() : double‟ to calculate volume of cylinder taking
„side‟ variable of base class as „radius‟ and print it.
*/


import java.io.*;

public class TestCylinder
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double rad,height;
		
		System.out.print("enter radius and height ::");
		rad = Double.parseDouble(br.readLine());
		height = Double.parseDouble(br.readLine());
		
		Cylinder cyl = new Cylinder(rad, height);
		
		cyl.getVolume();
	}
}
