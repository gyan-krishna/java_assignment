/*
Write a program in java to create a „Time‟ class. Use suitable
constructor to initialize time objects. Perform the addition and
subtraction of two time objects.
*/

import java.util.*;

public class Time
{
	int hours,mins;
	
	Time(int hrs, int min)
	{
		hours = hrs;
		mins = min;
	}
	Time()
	{
		hours = mins = 0;
	}
	Time add(Time t1, Time t2)
	{
		Time sum = new Time();
		
		sum.hours = t1.hours + t2.hours + (t1.mins+t2.mins)/60;
		sum.mins = (t1.mins + t2.mins)%60;
		
		return sum;
	}
	Time subs(Time t1, Time t2)
	{
		Time sub = new Time();
		
		sub.hours = t1.hours - t2.hours;
		sub.mins = t1.mins - t2.mins;
		if(sub.mins < 0)
		{
			sub.hours += -1;
			sub.mins -= 60;
		}
		return sub;
	}
	void display()
	{
		System.out.println("["+hours+":"+mins+"]");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int h1,h2,m1,m2;
		
		System.out.print("Enter the first time:: ");
		h1 = sc.nextInt();
		m1 = sc.nextInt();
		
		System.out.print("Enter the second time:: ");
		h2 = sc.nextInt();
		m2 = sc.nextInt();
		
		Time t1 = new Time(h1, m1);
		Time t2 = new Time(h2, m2);
		
		Time sum = t1.add(t1,t2);
		Time dif = t1.subs(t1,t2);
		
		System.out.print("sum is :: ");
		sum.display();
		
		System.out.print("differrence is :: ");
		dif.display();		
	}
}
