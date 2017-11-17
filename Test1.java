package QueueInt;

public class Test1
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
		//qi.print();
	//	int item10 = qi.dequeue();
			
	}