/*
program that sorts half of element in ascending
and rest half of the elements in descending order
*/

import java.util.*;
public class halfSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,mid,tmp,min;
		System.out.print("enter the length of the array::");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("enter the elements:: ");
		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
		
        mid = n/2;
        for(int i = 0 ; i < mid ; i++)
        {
            min = i;
            for(int j = i; j < mid ; j++)
            {
                if(arr[j] < arr[min])
                    min = j;
            }
            tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }

        for(int i = mid ; i < n ; i++)
        {
            min = i;
            for(int j = i; j < n ; j++)
            {
                if(arr[j] > arr[min])
                    min = j;
            }
            tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
		
		System.out.println("sorted array ::");
		for(int i = 0 ; i < n ; i++)
			System.out.print(arr[i]+" ");

	}
}
