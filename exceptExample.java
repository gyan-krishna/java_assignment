/*
Write a program in java that handles both
„ArrayIndexOutOfBoundsException‟ and
„ArithmeticException‟.
*/

import java.util.*;

public class exceptExample
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter a number :: ");
			int n = sc.nextInt();
			
			int div = 1/n;
			arr[n] = 0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception caught!");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("array index out of bounds Exception caught!");
		}
	}
}