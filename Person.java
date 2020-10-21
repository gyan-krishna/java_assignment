class Person
{
	String name;
	String address;
	
	Person(String n, String addr)
	{
		name = n;
		address = addr;
	}
	void setPerson(String n, String addr)
	{
		name = n;
		address = addr;
	}
	void showPerson()
	{
		System.out.println("Person[name="+name+"], address="+address+"]");
	}
}