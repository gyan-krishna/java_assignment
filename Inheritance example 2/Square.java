/*
Create a base class „Square‟ having instance variable side:double.
Initiate variable using constructor, a method „getVolume() :
double‟ that calculates volume and print it. Create a derived class
„Cylinder‟ having instance variable height:double. Initiate
variables of both classes through constructor, override method
„getVolume() : double‟ to calculate volume of cylinder taking
„side‟ variable of base class as „radius‟ and print it.
*/

public class Square
{
	double side;
	Square(double s)
	{
		side = s;
	}
	void getVolume()
	{
		double vol = Math.pow(side,3);
		System.out.println("the volume is ::"+vol);
	}
}
