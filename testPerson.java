public class testPerson
{
	public static void main(String args[])
	{
		staff x = new staff("mr richard", "bl-123", "NoName School",15000.00);
		Student y = new Student("mr ram", "bl-123", "workshop", "3rd", 1000.00);
		
		y.setStudent("mr ram", "bl-123", "workshop", "3rd", 3000.00);
		x.setStaff("mr richard", "bl-123", "NoName",10000.00);
		
		y.tostring();
		x.tostring();
	}
}