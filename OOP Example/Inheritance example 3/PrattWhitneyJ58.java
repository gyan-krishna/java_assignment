/*
Consider you are designing vehicles engine with „speed:int,
gear:int’. you can define your engine functionalities
„speedUp(value)‟ and „changeGear(value) in an interface. The
class which is implementing the interface should implement all
the methods in the interface.
*/

// P.s. Pratt and whitney J58 is the engine used in the SR-71 black bird,
// my favourite aircraft, fastest air breathing plane, with a recorded top speed
// of mach 3.5

public class PrattWhitneyJ58 implements Engine
{
	int currGear,maxGear;
	int currSpeed,maxSpeed;
	
	PrattWhitneyJ58()
	{
		currSpeed = 0;
		currGear = 0;
		maxSpeed = 3529;//km/h actual recorded top speed of sr71
		maxGear = 5;//sr 71 got no gears, but got to accomodate the question.
	}
	public void speedUp(int incr)
	{
		if(currSpeed + incr < maxSpeed)
			currSpeed = currSpeed + incr;
		else
			currSpeed = maxSpeed;
	
		System.out.println("currently at mach "+currSpeed);
	}
	public void changeGear(int targGear)
	{
		if(targGear >= 0 && targGear <= maxGear)
		{
			currGear = targGear;
			System.out.println("gear shifted to "+currGear);
		}
		else
			System.out.println("gear shift failed... ERROR..");
	}
}
