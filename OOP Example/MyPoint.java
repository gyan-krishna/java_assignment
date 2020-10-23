/*
. A class called MyPoint, which models a 2D point with x and y
coordinates. It contains:
> Two instance variables x (int) and y (int).
> A default (or "no-argument" or "no-arg") constructor that
construct a point at the default location of (0, 0).
> A overloaded constructor that constructs a point with the given x
and y coordinates.
> A method setXY() to set both x and y.
> A method getXY() which returns the x and y in a 2-element int
array.
> A toString() method that returns a string description of the
instance in the format "(x, y)".
> A method called distance(int x, int y) that returns the distance
from this point to another point at the given (x, y) coordinates,
Write the MyPoint class. Also write a test driver (called
TestMyPoint) to test all the public methods defined in the class.

*/


import java.util.*;

public class MyPoint
{
	int x,y;
	MyPoint()
	{
			x = y = 0;
	}
	MyPoint(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	void setXY(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	int[] getXY()
	{
		int xy[] = {x,y};
		return xy;
	}
	String tostring()
	{
		return "("+x+","+y+")";
	}
	int distance(int x2,int y2)
	{
		int dist = (int)( Math.sqrt(Math.pow((x2-x),2) + Math.pow((y2-y),2)) );
		return dist;
	}

}
