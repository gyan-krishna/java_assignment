/*
Write a program in java to delete all vowels from an input string
and print the result string.
*/
import java.util.*;

public class remVowels
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String res="",str;
		
		System.out.print("enter a string ::");
		str = sc.nextLine();
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e'||ch == 'i'||ch=='o'||ch=='u')
				continue;
			else
				res += ch;
		}
		System.out.println("resultant string ::"+res);
	}
}
