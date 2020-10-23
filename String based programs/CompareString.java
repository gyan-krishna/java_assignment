//Write a java program to compare two strings lexicographically.
import java.util.*;

public class CompareString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a,b;
		int diff = 0,len=0;
		
		System.out.print("Enter String a :: ");
		a = sc.nextLine();

		System.out.print("Enter String b :: ");
		b = sc.nextLine();
		
		len = a.length() < b.length()?a.length():b.length();
		
		for(int i = 0 ; i < len && diff == 0; i++)
		{
			diff = a.charAt(i) - b.charAt(i);
		}
		
		if(a.length() < b.length() && diff == 0)
			diff = -1;
		else if(diff == 0)
			diff = 1;
		
		System.out.println("Ans by manual method::"+diff);
		System.out.println("Ans by predefine function::"+ a.compareTo(b));
	}
}