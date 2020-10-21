/*
Consider you are designing vehicles engine with „speed:int,
gear:int’. you can define your engine functionalities
„speedUp(value)‟ and „changeGear(value) in an interface. The
class which is implementing the interface should implement all
the methods in the interface.
*/

public class EngineTest
{
	public static void main(String args[])
	{
		PrattWhitneyJ58 sr71 = new PrattWhitneyJ58();
		
		sr71.changeGear(2);
		sr71.speedUp(700);
		
		sr71.changeGear(4);
		sr71.speedUp(2000);
	}
}