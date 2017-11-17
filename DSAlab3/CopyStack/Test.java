package CopyStack;

public class Test 
{
	public static void main(String[] args)
	{
		StackInt si1=new StackInt();
		StackInt si2=new StackInt();
		si1.push(67);
		si1.push(12);
		si1.push(123);
		si1.push(143);
		si1.push(9);
		si1.pop();
		System.out.println("Original Stack: ");
		si1.print();
		si1.copyStack(si2);
		System.out.println("Copied Stack: ");
		si2.print();
		
	}
}
