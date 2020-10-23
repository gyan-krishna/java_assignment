//Write a Java method to count all words in a string.

import java.util.*;

public class CountWords
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int freq = 0;
		
		System.out.print("Enter String :: ");
		str	 = sc.nextLine() + " ";
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(str.charAt(i) == ' ')
				freq++;
		}
		System.out.println("number of words :: "+freq);
	}
}