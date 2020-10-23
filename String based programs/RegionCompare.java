/*
Write a Java program to find whether a region in the current
string matches a region in another string.

*/
import java.util.*;

public class RegionCompare
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		String a, b;
		int al, au, bl, bu;
		
		System.out.print("Enter String a :: ");
		a = sc.nextLine();

		System.out.print("Enter String b :: ");
		b = sc.nextLine();
		
		System.out.print("Enter region of intrest in a :: ");
		al = sc.nextInt();
		au = sc.nextInt();

		System.out.print("Enter region of intrest in b :: ");
		bl = sc.nextInt();
		bu = sc.nextInt();
		
		boolean ans = a.substring(al,au).equals(b.substring(bl,bu));
		
		System.out.println(ans);
	}
}