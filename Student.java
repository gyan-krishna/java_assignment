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