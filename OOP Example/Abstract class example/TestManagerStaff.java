public class TestManagerStaff
{
	public static void main(String args[])
	{
		Manager e = new Manager("Rick");
		Staff s   = new Staff("Morty");
		
		e.compute();
		s.compute();
		
		e.display();
		s.display();
	}
}