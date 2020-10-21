/*
Create a superclass „Person‟ and two subclasses „Student‟ and „Staff‟. 
The following are the instance variables and methods:
a. For „Person‟ instance variables: name:String, address:String. Initiate 
   variable through constructor, incorporate one method setPerson() 
   that updates Person variables , another method tostring() that shows 
   Person details as “Person[name=?,address=?”.
   
b. For „Student‟ sub class instance variables: program:String, year:String,
   fees:double. Initiate both „Student‟ and „Person‟ variables through 
   constructor, incorporate one method setStudent() that updates both 
   student and „Person‟ data, another method tostring() that shows 
   „Person-Student‟ details as “Person[name=?,address=?,Program=?,Year=?,Fees=?”.
   
c. For „Staff‟ subclass instance variables: school:String, pay:double. Initiate both 
   „Staff‟ and „Person‟ variables through constructor, incorporate one method setStaff() 
   that updates both „staff‟ and „Person‟ data, another method tostring() that shows 
   „Person-Staff‟ details as “Person[name=?,address=?,School=?,Pays=?”.
   
   Write the classes and a test driver main class to test all functions mentioned above. 
*/
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