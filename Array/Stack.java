/*
Write a program in java to create a „stack‟ class. Use suitable
constructor to initialize the top element of the stack. Use
suitable push and pop methods to maintain the growth and shrink
of the stack respectively. The program should response properly
in case of overflow and underflow exceptions.
*/
import java.util.*;

public class Stack
{
	int size;
	int dat[];
	int top;
	Stack()
	{
		size = 100;
		dat = new int[size];
		top = -1;
	}
	Stack(int s)
	{
		size = s;
		dat = new int[size];
		top = -1;		
	}
	void push(int x)
	{
		if(top == size-1)
			System.out.println("ERROR!! stack overflow");
		else
			dat[++top] = x;
	}
	int pop()
	{
		if(top == -1)
		{
			System.out.println("ERROR!! stack underflow");
			return -1;
		}
		else
			return dat[top--];
	}
	void display()
	{
		System.out.print("stack contents ::");
		for(int i = 0 ; i <= top ; i++)
			System.out.print(dat[i]+" ");
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int opt,num,s;
		boolean loopCont = true;
		
		System.out.print("Enter size of the stack ::");
		s = sc.nextInt();
		
		Stack stk = new Stack(s);
		
		while(loopCont)
		{
			System.out.println("-------------------------------------");
			System.out.println("Choices ::");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display Stack");
			System.out.println("4. Exit");
			
			System.out.print("Your Choice :: ");
			opt = sc.nextInt();
			switch(opt)
			{
				case 1:
					System.out.print("enter data to be pushed ::");
					num = sc.nextInt();
					stk.push(num);
					break;
				case 2:
					num = stk.pop();
					System.out.println("Popped element ::"+num);
					break;
				case 3:
					stk.display();
					break;
				case 4:
					loopCont = false;
					break;
				default:
					System.out.println("ERROR!! Invalid Input!!");
			}
		}
	}
}
