class Queue{
	Node front=null;
	Node rear=null;
	public void enqueue(int item){
		Node newnode=new Node(item);
		if((front==null)&&(rear==null)){
			front=rear=newnode;
		}
	else{
		rear.next=newnode;
		rear=newnode;
	}
	}
	public void dequeue(){
		if(front==null){
		System.out.println("list empty");
		}
		else{
			front=front.next;
		}
	}
	public void print(){
		Node temp=front;
		while(temp!=rear){
			System.out.print(temp.data+"   ");
			temp=temp.next;
			}
		System.out.print(temp.data);
	}
}
