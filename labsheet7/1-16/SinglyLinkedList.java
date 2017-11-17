class SinglyLinkedList{
	public Node head=null;
	public void insert_at_head(int value){
		Node newnode=new Node(value);
		if(head==null){
			head=newnode;
		}
		else{
			newnode.next=head;
			head=newnode;
		}
	}
	public void print(){
		if(head==null){
		System.out.println("Empty list");
		}
		else{
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"  ");
			temp=temp.next;
			}
		}
	}
	public void insert_at_tail(int value){
		Node newnode=new  Node(value);
		if(head==null){
			head=newnode;
		}
		else{
			Node temp=head;	
			while(temp.next!=null){
			temp=temp.next;
			}
			temp.next=newnode;
		}	
	}
	public void insert_at_position(int value,int k){
		Node newnode=new  Node(value);
		if(head==null){
			head=newnode;
		}
		else{
			Node temp=head;	
			int i=1;
			while(i<k-1){
			temp=temp.next;
			i=i+1;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}	
	}
	public void delete_at_pos(int k){
		if(head==null){
			System.out.println("Linked List is empty");
		}
		else{
			Node temp=head;
			Node temp2=head;	
			int i=1;
			while(i<k-1){
			temp=temp.next;
			i=i+1;
			}
			temp2=temp.next;
			temp.next=temp2.next;
		}	
	 }
	public void delete_at_value(int value){
		int flag=-1;
		if(head==null){
			System.out.println("Linked List is empty");
		}
		else{
			Node temp=head;
			Node temp2=head;	
			do{
				if(temp.next.data==value){
					temp2=temp.next.next;
					temp.next=temp2;
					
					 flag=0;
					}
				temp=temp.next;
			}while(temp.next!=null);
			if(flag!=0){
				System.out.println("element not found");
			}
		}	
	 }
	public void no_of_nodes(){
		if(head==null){
			System.out.println("Linked List is empty");
		}
		else{
			Node temp=head;
			int count=0;
		
			while(temp!=null){
			count=count+1;
			temp=temp.next;
			
			}
		System.out.println("no of elements in the linked list are "+count);
		}	
	 }
	public int sum(){
		if(head==null){
			System.out.println("Linked List is empty");
			return 0;
		}
		else{
			Node temp=head;
			int sum=0;
			while(temp!=null){
			sum=sum+temp.data;
			temp=temp.next;
			}
			return sum;
		}	
	 }
	public void changenode(int value,int changevalue){
		int flag=-1;
		if(head==null){
			System.out.println("Linked List is empty");
		}
		else{
			Node temp=head;
			Node temp2=head;	
			do{
				if(temp.data==value){
					temp.data=changevalue;
					 flag=0;
					}
				temp=temp.next;
			}while(temp.next!=null);
			if(flag!=0){
				System.out.println("element not found");
			}
		}	
	 }
	public void move_large_end(){
		int large;
		int k=0;
		if(head==null){
			System.out.println("Linked List is empty");
		}
		else{
			Node temp=head;
			Node temp2=head;
			Node temp3=head;	
			int i=1;
			int p=1; 
			large=temp.data;
			temp=temp.next;
			while(temp!=null){
				i=i+1;
				if(large<temp.data){
				large=temp.data;
				p=i;
				}	
			temp=temp.next;
			}
			System.out.println();
			System.out.println("large="+large);
			System.out.println("position="+p);
			i=1;
			while(i<p-1){
			temp3=temp3.next;
			i=i+1;
			}
			temp2=temp3.next;
			
			temp3.next=temp2.next;
			temp2.next=null;
			while(temp3.next!=null){
				temp3=temp3.next;
			}
				temp3.next=temp2;
		}
	}
	public void search(int item){
		int flag=-1;
		System.out.println("searching element="+item);
		Node temp=head;
		while(temp!=null){
			if(temp.data==item){
				flag=0;
			}
		temp=temp.next;
		}
		if(flag==0){
			System.out.println("element found");
		}
		else{
			System.out.println("element not found");
		}		
		}
	public void concatenate(SinglyLinkedList ob1){
		Node temp=ob1.head;
		System.out.println();
		Node temp2=head;
			while(temp.next!=null){
				temp=temp.next;
				
			}
			temp.next=temp2;	
		}
	public void delete_even(){
		Node temp=head;
		Node temp2;
		int i=1;
		while(temp.next!=null){
			if(i%2!=0){
				temp2=temp.next;
				temp.next=temp2.next;
			}
			else{
				temp=temp.next;
			}
		i=i+1;
		}
	}
	public void reversewithrecursion(Node temp,int count){
		if (temp.next.next == null){
			temp.next.next = temp;
			//System.out.println(temp.data);
			head = temp.next;
			return;
		}
		else{
			reversewithrecursion(temp.next,count+1);
			temp.next.next = temp;
			if (count == 0){
				temp.next = null;
			}
		}
	}
	public void split(){
		Node temp=head;
		Node temp2;
		Node temp3=head;
		Node temp4=head.next;;
		int i=1;
		while(temp.next!=null){
			if(i%2!=0){
				temp3=temp.next;
				temp2=temp.next;
				temp.next=temp2.next;
				if(i==1){
					temp4=temp3;
				}
			}
			else{
			
				temp=temp.next;
				temp3.next=temp.next;
				//System.out.print(temp3.next.data);
			}
		i=i+1;
		}
		System.out.print("the elements in even position are:  ");
		while(temp4.next!=null){
			System.out.print(temp4.data+"  ");
			temp4=temp4.next;
		}
			System.out.print(temp4.data);
	}
}
