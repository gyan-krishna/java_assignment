public class staff extends Person
{
	String school;
	double pay;
	staff(String name, String addr, String schl,double p)
	{
		super(name, addr);
		school = schl;
		pay = p;
	}
	void setStaff(String name, String addr, String schl,double p)
	{
		super.name = name;
		super.address = addr;
		school = schl;
		pay = p;
	}	
	void tostring()
	{
		String res;
		res = "Person[name="+super.name+", address="+super.address+", School="+school+", pay="+pay+"]";
		System.out.println(res);
	}		
}