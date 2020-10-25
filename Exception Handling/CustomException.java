/*
Write a program to create your own exception as
NegativeSizeException whenever negative values are put in an
array.
*/

import java.util.*;

class NegativeSizeException extends Exception
{
	public NegativeSizeException(String s)
	{
		super(s);
	}
}

public class CustomException
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("enter the numbers ::");
		try
		{
			for(int i=0 ; i < 10 ; i++)
			{
				arr[i] = sc.nextInt();
				if(arr[i] < 0)
					throw new NegativeSizeException("-ve exception");
			}
		}
		catch(NegativeSizeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
