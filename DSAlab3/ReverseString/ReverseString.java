package ReverseString;

public class ReverseString {
	char[] arr=new char[10];
	int top=-1;
	char k,item;
	int i;
	ReverseString()
	{
		arr=new char[10];
		top=-1;
	}
	public void push(char item)
	{
		if(top+1==arr.length)
		{
			System.out.println("overflow of stack");
		}
		else
		{
			top=top+1;
			arr[top]=item;
		}
	}
	public char pop()
	{
		if(top==-1)
		{
			System.out.println("underflow of stack");
			return 'o';
		}
		else
		{
			k=arr[top];
			top=top-1;
			return k;
		}
	}
	public void print()
	{
		for(i=0;i<=top;i++)
		{
			System.out.println(arr[i]+"  ");
		}
	}
	public void reverseString(ReverseString si2)
	{
		for(i=top;i>=0;i--)
		{
			k=this.pop();
			si2.push(k);
		}
	}
}
