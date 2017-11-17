package ReverseString;

public class Test {
	public static void main(String[] args)
	{
		ReverseString si1=new ReverseString();
		ReverseString si2=new ReverseString();
		si1.push('m');
		si1.push('a');
		si1.push('n');
		si1.push('a');
		si1.push('s');
		si1.push('a');
		si1.push('d');
		si1.pop();
		System.out.println("original String:  :");
		si1.print();
		si1.reverseString(si2);
		System.out.println("Reverse String: ");
		si2.print();
	}
}

