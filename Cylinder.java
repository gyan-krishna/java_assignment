/*
Create a base class „Square‟ having instance variable side:double.
Initiate variable using constructor, a method „getVolume() :
double‟ that calculates volume and print it. Create a derived class
„Cylinder‟ having instance variable height:double. Initiate
variables of both classes through constructor, override method
„getVolume() : double‟ to calculate volume of cylinder taking
„side‟ variable of base class as „radius‟ and print it.
*/


public class Cylinder extends Square
{
	double height;
	Cylinder(double rad, double h)
	{
		super(rad);
		height = h;
	}
	void getVolume()
	{
		double vol = Math.PI * Math.pow(super.side,2) * height;
		System.out.println(height+" "+super.side+" the volume of the cylinder is ::"+vol);
	}
}