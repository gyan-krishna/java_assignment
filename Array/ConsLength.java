/*
Write a Java program to find the length of the longest
consecutive elements sequence from a given unsorted array of
integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5],
therefore the program will return its length 5.
*/

import java.util.*;

public class ConsLength
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,len=1,lenmax=0,prev;
		int arr[];
		
		System.out.print("enter the length of the array :: ");
		n = sc.nextInt();
		
		arr = new int[n];
		
		System.out.println("enter the elements");
		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n - 1 - i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		
		for(int i = 0 ; i < n-1 ; i++)
		{
			if(arr[i]+1 == arr[i+1])
				len++;
			else
			{
				if(len > lenmax)
					lenmax = len;
				len=1;
			}
		}	
		System.out.println("max length of consecutive numbers = "+lenmax);
	}	
}