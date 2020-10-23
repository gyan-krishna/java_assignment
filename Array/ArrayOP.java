/*
Write a Java program to perform the following –
1. to remove a specific element from an array.
2. to insert an element (specific position) into an array.
3. to find a particular element from an array. Response properly for
unsuccessful search.
4. to find all pairs of elements in an array whose sum is equal to a
specified number.
5. to remove the duplicate elements of a given array and return the
new length of that array.
*/
import java.util.*;

public class ArrayOP
{
	int arr[],len,n;
	ArrayOP(int length)
	{
		len = length;
		n = -1;
		arr = new int[len];
	}
	ArrayOP()
	{
		len = 20;
		n = 0;
		arr = new int[len];
	}
	void insertPosition(int p,int dat)
	{
		if(n == len-1)
			System.out.println("insertion error:: overflow");
		else
		{
			for(int i = n ; i >= p ; i--)
				arr[i+1] = arr[i];
			arr[p] = dat;
			n++;
		}
		display();
	}
	void removePosition(int x)
	{
		if(x <= n)
		{
			for(int i = x; i <= n ; i++)
				arr[i] = arr[i+1];
			n--;
		}
		else
			System.out.println("deletion error:: element not found");
	}
	void removeElement(int x)
	{
		for(int i = 0 ; i <= n ; i++)
		{
			if(arr[i] == x)
				removePosition(i);
		}
	}
	int search(int s)
	{
		for(int i = 0; i <= n ; i++)
		{
			if(arr[i] == s)
				return i;
		}
		return -1;
	}
	void pairSum(int sum)
	{
		for(int i=0; i <= n ; i++)
		{
			for(int j=i ;j <= n ; j++)
				if(arr[i] +arr[j]== sum)
					System.out.println("Pairs :: "+arr[i]+", "+arr[j]);
		}
	}
	int deleteDuplicate()
	{
		for(int i = 0 ; i <= n ; i++)
		{
			for(int j = i+1; j <= n ; j++)
				if(arr[i] == arr[j])
					removePosition(j);
		}
		return n;
	}
	void display()
	{
		for(int i = 0 ; i <= n ;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int opt,num,s,pos,res;
		boolean loopCont = true;
		
		System.out.print("Enter max size of the array ::");
		s = sc.nextInt();
		
		ArrayOP arr = new ArrayOP(s);
		
		while(loopCont)
		{
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Choices ::");
			System.out.println("1. remove a specific element from an array.");
			System.out.println("2. insert an element (specific position) into an array");
			System.out.println("3. find a particular element from an array.");
			System.out.println("4. find all pairs of elements whose sum is equal to a specified number.");
			System.out.println("5. remove the duplicate elements");
			System.out.println("6. remove element at a position");
			System.out.println("7. display the array");
			System.out.println("8. exit");
			
			System.out.print("Your Choice :: ");
			opt = sc.nextInt();
			switch(opt)
			{
				case 1:
					System.out.print("enter data to be removed ::");
					num = sc.nextInt();
					arr.removeElement(num);
					break;
				case 2:
					System.out.print("enter data to be inserted ::");
					num = sc.nextInt();
					System.out.print("enter position ::");
					pos = sc.nextInt();
					
					arr.insertPosition(pos,num);
					break;
				case 3:
					System.out.print("enter data to be searched ::");
					num = sc.nextInt();
					
					res = arr.search(num);
					if(res != -1)
						System.out.println("element not found");
					else
						System.out.println("element found! ");
					
					break;
				case 4:
					System.out.print("enter the sum ::");
					num = sc.nextInt();
					
					arr.pairSum(num);
					break;
				case 5:
					arr.deleteDuplicate();
					break;
				case 6:
					System.out.print("enter the position ::");
					pos = sc.nextInt();	

					arr.removePosition(pos);
					break;
				case 7:
					arr.display();
					break;
				case 8:
					loopCont = false;
					break;
				default:
					System.out.println("ERROR!! Invalid Input!!");
			}
		}
	}
}