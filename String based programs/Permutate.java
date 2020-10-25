/*
Write a Java program to print all permutations of a
given string with repetition.
*/

import java.util.*;

public class Permutate
{
	void display(String str, String fix)
	{
		if( fix.length() == str.length() )
			System.out.println(fix);
		else
		{
			for(int i = 0 ; i < str.length() ; i++)
			{
				display(str, fix+str.charAt(i));
			}
		}
	}
	public static void main(String args[])
	{
		Permutate ob = new Permutate();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter string to be permutate ::");
		String str = sc.nextLine();
		
		System.out.println("the permutation is ::");
		ob.display(str,"");
	}
}