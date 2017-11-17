package StackInt;

public class Test {
	public static void main(String[] args)
	{
		StackInt si=new StackInt();
		System.out.println("Stack top is"+si.top);
		System.out.println("Size of array"+si.arr.length);
		StackInt si3=new StackInt(15);
		System.out.println("Size of second array="+si3.arr.length);
		
		si.push(100);
		si.print();
		si.push(200);
		si.print();
		si.push(300);
		si.print();
		si.push(400);
		si.print();
		si.push(500);
		si.print();
		si.push(600);
		si.print();
		si.push(700);
		si.print();
		si.push(800);
		si.print();
		si.push(900);
		si.print();
		si.push(1000);
		si.print();
		si.push(1100);
		si.print();
		System.out.println("top of the stack:"+si.getTop());
		int item1= si.pop();
		si.print();
		int item2=si.pop();
		si.print();
		int item3= si.pop();
		si.print();
		int item4=si.pop();
		si.print();
		int item5= si.pop();
		si.print();
		int item6=si.pop();
		si.print();
		int item7= si.pop();
		si.print();
		System.out.println("peeked element"+si.peek()); 
		si.push(1500); 
		System.out.println(si.peek()); 
		si.push(2500); 
		System.out.println(si.peek());
		si.push(3500);
		System.out.println(si.peek());
		StackInt si1 = new StackInt(); 
		StackInt si2 = new StackInt(); 
		si1.push(100); 
		si2.push(100); 
		si1.push(200); 
		si2.push(200); 
		System.out.println("si1 is:");
		si1.print();
		System.out.println("si2 is:");
		si2.print();
		if(si1.equals(si2))
		{

			System.out.println("si1 and si2 are same");
		}
		else
		{
			System.out.println("si1 and si2 are not same");
		} 
		si1.push(100); 
		si2.push(100); 
		si1.push(200); 
		si2.push(300);
		System.out.println("si1 is:");
		si1.print();
		System.out.println("si2 is:");
		si2.print();
		if(si1.equals(si2))
		{

			System.out.println("si1 and si2 are same");
		}
		else
		{
			System.out.println("si1 and si2 are not same");
		} 
		si1.getMinimumElement();
		si2.push(0);
		si2.push(3);
		si2.getMinimumElement();
	}
}
