class Dequeue{
int arr[] =new int [5];
int rear=-1;
int front=-1;
int n=5;
	public void insertrear(int item){
		if((rear+1)%n==front){
			System.out.println("over flow");
		}
		else if(isempty()){
			rear=0;
			front=0;
			arr[rear]=item;
		}
		else{
			rear=(rear+1);
			arr[rear]=item;
			}
	}
	public void insertfront(int item){
		if((rear+1)%n==front){
			System.out.println("over flow");
		}
		else if(isempty()){
			front=0;
			rear=0;
			arr[front]=item;
		}
		else{
			front=(front+n-1)%n;
			arr[front]=item;
			}
	}	
	public void deletefront(){
		if(isempty()){
			System.out.println("under flow");
		}
		else if(front==rear){
			rear=-1;
			front=-1;
		}
		else{
			front=(front+1)%n;
			}
	}
	public void deleterear(){
		if(isempty()){
			System.out.println("under flow");
		}
		else if(front==rear){
			rear=-1;
			front=-1;
		}
		else{
			rear=(rear+n-1)%n;
			}
	}
	public int getfront(){
		if(front!=-1)
		{
		return arr[front];
		}		
		else {
			System.out.println("no elemnent is persent ");
			return 0;
		    }
	}
	public int getrear(){
		if(rear!=-1)
		{
		return arr[rear];
		}		
		else {
			System.out.println("no elemnent is persent ");
			return 0;
		    }
	}
	public boolean isempty(){
		if((front==-1)&&(rear==-1)){
			return true;
		}
		else 
			return false;
	}

	public void isfull(){
		if(((rear+1)%n==front)||((rear+n-1)%n==front)){
				System.out.println(" over flow");
			}
		else{
			System.out.println("queue is not filled");
		}
	}
	public void display(){
		if(isempty()){
			System.out.println("queue is empty");
		}
		else{
		int i=front;
		while(i!=rear)
		{
			System.out.print(arr[i]+" ");
			i=(i+1)%n;
		}
		System.out.print(arr[i]);
		System.out.println();
		}
	}
}

