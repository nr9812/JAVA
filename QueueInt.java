
public class QueueInt 
{
	int[] arr = new int[5];
	int front=-1,rear=-1;
	
	QueueInt()
	{
		arr=new int[10];
		front = -1;
		rear = -1;
	}
	
	QueueInt(int sz)
	{
		arr= new int [sz];
		front = -1;
		rear = -1;
	}
	
	public void print()
	{
		if (front==rear)
		{
			System.out.println ("Cant pop");
		}
		
		for (int i=front;i<=rear;i++)
		{
			System.out.print (+arr[i]+" ");
		}
		System.out.println (" ");
	}
	
	public boolean IsEmpty()
	{
		if (front==-1 && rear==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void enqueue (int item)
	{
		if (rear==(arr.length-1))
		{
			System.out.println ("Can't Enqueue");
		}
		
		else if (IsEmpty())
		{
			front = rear=0;
			arr[rear]=item;
		}
		else
		{
			rear=rear+1;
			arr[rear]=item;
		}
		
	}
	
	public int getFront()
	{
		return arr[front];
	}
	
	public int dequeue()
	{
		if (IsEmpty())
		{
			System.out.println ("Queue is empty");
			return -1;
		}
		else if (front == rear)
		{
			int item = arr[front];
			front=-1;
			rear=-1;
		//	System.out.println ("Cant pop");
			return item;
		}
		else
		{
			int item = arr[front];
			front=front+1;
			return item;
		}
		
		
	}
	
}


class Test1
{
	public static void main (String [] args)
	{
		QueueInt qi = new QueueInt();
		System.out.println("Queue Front is " +qi.front+" and Rear is " +qi.rear);
		System.out.println (qi.arr.length);
		QueueInt qi2 = new QueueInt (15);
		System.out.println (qi2.arr.length);
		qi.enqueue(100);
		qi.print();
		qi.enqueue (200);
		qi.print();
		qi.enqueue (300);
		qi.print();
		qi.enqueue (400);
		qi.print();
		qi.enqueue (500);
		qi.print();
		qi.enqueue (600);
		qi.print();
		qi.enqueue (700);
		qi.print();
		qi.enqueue (800);
		qi.print();
		qi.enqueue (900);
		qi.print();
		qi.enqueue (1000);
		qi.print();
		qi.enqueue (1100);
		System.out.println ("The front is " +qi.getFront());
		int item = qi.dequeue();
		qi.print();
		int item1 = qi.dequeue();
		qi.print();
		int item2 = qi.dequeue();
		qi.print();
		int item3 = qi.dequeue();
		qi.print();
		int item4 = qi.dequeue();
		qi.print();
		int item5 = qi.dequeue();
		qi.print();
		int item6 = qi.dequeue();
		qi.print();
		int item7 = qi.dequeue();
		qi.print();
		int item8 = qi.dequeue();
		qi.print();
		int item9 = qi.dequeue();
		qi.print();
		int item10 = qi.dequeue();
			
	}
}