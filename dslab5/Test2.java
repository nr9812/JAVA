package QueueInt;

public class Test {
		public static void main(String[] args){
		QueueInt qi=new QueueInt();
		System.out.println("Front of Queue: "+qi.front+"Rear of Queue: "+qi.rear);
		System.out.println("Length of Queue: "+qi.ar.length);
		QueueInt qi3=new QueueInt(20);
		System.out.println("length of second Queue:  "+qi3.ar.length);
		qi.enqueue(100); 
		qi.print(); 
		qi.enqueue(200); 
		qi.print();
		qi.enqueue(300); 
		qi.print(); 
		qi.enqueue(400); 
		qi.print();
		qi.enqueue(500); 
		qi.print(); 
		qi.enqueue(600); 
		qi.print();
		qi.enqueue(700); 
		qi.print(); 
		qi.enqueue(800); 
		qi.print();
		qi.enqueue(900); 
		qi.print(); 
		qi.enqueue(300); 
		qi.print();
		System.out.println("Front of Queue:  "+qi.getFront());
		int item1=qi.dequeue(); 
		qi.print(); 
		int item2=qi.dequeue(); 
		qi.print();
		int item3=qi.dequeue(); 
		qi.print(); 
		int item4=qi.dequeue(); 
		qi.print();
		int item5=qi.dequeue(); 
		qi.print(); 
		int item6=qi.dequeue(); 
		qi.print();
		int item7=qi.dequeue(); 
		qi.print(); 
		int item8=qi.dequeue(); 
		qi.print();
		int item9=qi.dequeue(); 
		qi.print(); 
		int item10=qi.dequeue(); 
		qi.print(); 
		int item11=qi.dequeue(); 
		qi.print(); 
		QueueInt qi1=new QueueInt();
		QueueInt qi2=new QueueInt();
		qi1.enqueue(1);
		qi2.enqueue(1);
		qi1.enqueue(2);
		qi2.enqueue(2);
		qi1.enqueue(3);
		qi2.enqueue(3);
		if(qi1==qi2)
		{
			System.out.println("qi1 and qi2 are SAME");
		}
		else
		{
			System.out.println("qi1 and qi2 are NOT SAME");

		}
		qi1.enqueue(4);
		qi2.enqueue(4);
		qi1.enqueue(5);
		qi2.enqueue(5);
		qi2.enqueue(6);
		if(qi1.equals(qi2))
		{
			System.out.println("Queues are same");
		}
		else
		{
			System.out.println("Queues are not same");	
		}
	}
}
