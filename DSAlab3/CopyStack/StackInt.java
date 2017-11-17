

public class StackInt {
	int i,k,j;
	int[] arr=new int[10];
	int top = -1;
	StackInt()
	{
		arr=new int[10];
		top=-1;
	}
	public void print()
	{
		System.out.println("");
		for(i=0;i<=top;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	public void push(int item)
	{
		if(top+1>=arr.length)
		{
			System.out.println("Can't push");		
		}
		else
		{
			top=top+1;
			arr[top]=item;
		}
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("can't pop");
			return -1;
		}
		else
		{
			int item=arr[top];
			top=top-1;
			return item;
	
		}
	}
	public void copyStack(StackInt si2)
	{
		StackInt temp=new StackInt();
		int m=top;
		for(j=top;j>=0;j--)
		{
			k=this.pop();
			temp.push(k);
		}
		for(j=m;j>=0;j--)
		{
			k=temp.pop();
			si2.push(k);
		}
	}
}

class Test 
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

