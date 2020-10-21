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
public class Student extends Person
{
	String program, year;
	double fees;
	Student(String name, String addr, String prog, String yr, double f)
	{
		super(name,addr);
		program = prog;
		year = yr;
		fees = f;
	}
	void setStudent(String name, String addr, String prog, String yr, double f)
	{
		super.name = name;
		super.address = addr;
		program = prog;
		year = yr;
		fees = f;		
	}
	void tostring()
	{
		String res;
		res = "Person[name="+super.name+", address="+super.address+", Program="+program+", year="+year+", Fees="+fees+"]";
		System.out.println(res);
	}
}