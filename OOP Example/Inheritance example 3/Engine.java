/*
Consider you are designing vehicles engine with „speed:int,
gear:int’. you can define your engine functionalities
„speedUp(value)‟ and „changeGear(value) in an interface. The
class which is implementing the interface should implement all
the methods in the interface.
*/
public interface Engine
{	
	void speedUp(int incr);
	void changeGear(int targGear);
}
