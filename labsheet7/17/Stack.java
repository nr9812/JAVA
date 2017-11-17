class Stack{
	public Node top=null;
public void push(int item){
		Node newnode=new Node(item);
		if(top==null){
			top=newnode;
		}
		else{
		newnode.next=top;
		top=newnode;
		}
	}
public void pop(){
	if(top==null){
		System.out.println("list empty");
		}
	else{
		top=top.next;
	}
}
	public void print(){
		Node temp=top;
		while(temp.next!=null){
			System.out.print(temp.data+"   ");
			temp=temp.next;
		}
		System.out.print(temp.data);
	}
}
		
