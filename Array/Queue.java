import java.util.*;

public class Queue
{
	int front,rear,size;
	int data[];

	Queue()
	{
		size = 100;
		front = rear = -1;
		data = new int[size];
	}
	Queue(int n)
	{
		size = n;
		front = rear = -1;
		data = new int[size];
	}
	void enQueue(int x)
	{
		if(rear == size -1 )
			System.out.println("ERROR! Queue overflow!");
		else
			data[++rear] = x;
		
		if(front==-1)
			front++;
	}
	int deQueue()
	{
		int num = -1;
		if(front == -1)
			System.out.println("ERROR! Queue underflow!");
		else if(front == rear)
		{
			num = data[front];
			front = rear = -1;
		}
		else
			num = data[front++];
		
		return num;
	}
	void display()
	{
		System.out.println(front+" "+rear);
		System.out.print("Queue contents ::");
		for(int i = front ; i <= rear ; i++)
			System.out.print(data[i]+" ");
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int opt,num,s;
		boolean loopCont = true;
		
		System.out.print("Enter size of the stack ::");
		s = sc.nextInt();
		
		Queue Q = new Queue(s);
		
		while(loopCont)
		{
			System.out.println("-------------------------------------");
			System.out.println("Choices ::");
			System.out.println("1. En-Queue");
			System.out.println("2. De-Queue");
			System.out.println("3. Display Queue");
			System.out.println("4. Exit");
			
			System.out.print("Your Choice :: ");
			opt = sc.nextInt();
			switch(opt)
			{
				case 1:
					System.out.print("enter data to be enQueued ::");
					num = sc.nextInt();
					Q.enQueue(num);
					break;
				case 2:
					num = Q.deQueue();
					System.out.println("De-Queued element ::"+num);
					break;
				case 3:
					Q.display();
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
