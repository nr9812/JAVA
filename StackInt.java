package StackInt;

public class StackInt
{
	public int i;
	int [] arr = new int[5];
	int top = -1;

	StackInt()
	{
		arr = new int[10];
		top = -1;
	}

	StackInt(int sz)
	{
		arr= new int [sz];
		top = -1;
	}

	public void print()
	{
		int i;
		for(i=0;i<=top;i++)
		{
			System.out.print(+arr[i]+" ");
		}
		System.out.println (" ");
	}

	public void push(int item)
	{
		if (top>=(arr.length-1))
		{
			System.out.println ("Cant push");
		}
		else
		{
			top =top+1;
			arr[top]=item;	
		}
		
	}

	public int getTop()
	{
		return arr[top];
	}

	public int pop()
	{
		if(top==-1)
		{
			System.out.println ("Cant pop");
			return -1;
		}
		else 
		{
			int item = arr[top];
			top= top-1;
			return item;
		}
	}

	public int peek()
	{
		if (top==-1)
		{
			System.out.println ("Cant peek");
			return -1;
		}
		else 
			return arr[top];
	}

	int flag=0;
	public boolean equals(StackInt si1,StackInt si2)
	{
		if(this.arr.length==si2.arr.length)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(this.arr[i]!=si2.arr[i])
				{
					flag=1;
					break;
				}
			}
		}
		else
		{
			flag=0;
		}
		if(flag==1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public void getMinimumElement()
	{
		for(i=0;i<=top-1;i++)
		{
			for(int j=i+1;j<=top;j++)
			if(arr[i]>arr[j])
			{
				int k=arr[i];
				arr[i]=arr[j];
				arr[j]=k;
			}
		}
		System.out.println("minimum element in a stack : "+arr[0]);
	}

}

 

