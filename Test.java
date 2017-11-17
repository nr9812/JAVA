package StackInt;

public class Test
{
	public static void main (String[]args)
	{
		StackInt si = new StackInt();
		System.out.println("Stack top is " +si.top);
		System.out.println(si.arr.length);
		StackInt si2 = new StackInt(15);
		System.out.println(si2.arr.length);
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
		System.out.println (si2.getTop());
		int item = si.pop();
		si.print();
		int item1 = si.pop();
		si.print();
		int item2 = si.pop();
		si.print();
		int item3 = si.pop();
		si.print();
		int item4 = si.pop();
		si.print();
		int item5 = si.pop();
		si.print();
		int item6 = si.pop();
		si.print();
		int item7 = si.pop();
		si.print();
		int item8 = si.pop();
		si.print();
		int item9 = si.pop();
		si.print();
		int item10 = si.pop();
		si.print();

		System.out.println (si.peek());
		si.push (100);
		System.out.println (si.peek());
		si.push(200);
		System.out.println (si.peek());
		si.push(300);
		System.out.println (si.peek());

		StackInt si1 = new StackInt();
		StackInt si2 = new StackInt();
		si1.push(100);
		si2.push (100);
		si1.push(200);
		si2.push (200);
		System.out.println("si1 is:");
		si1.print();
		System.out.println("si2 is:");
		si2.print();

		boolean code = si2.equals (si1.top,si2.top);
		if (code)
		{
			System.out.println ("Both si1 and si2 are same");
		}
		else
		{
			System.out.println ("Both si1 and si2 are not the same");
		}
		si1.push(100);
		si2.push (100);
		si1.push(200);
		si2.push (300);
		System.out.println("si1 is:");
		si1.print();
		System.out.println("si2 is:");
		si2.print();
		
		if (code)
		{
			System.out.println ("Both si1 and si2 are same");
		}
		else
		{
			System.out.println ("Both si1 and si2 are not the same");
		}

	}
}
