class Test{
	public static void main(String [] args){
		Dequeue d=new Dequeue();
		d.insertfront(10); 
		d.insertrear(20);
		d.insertfront(30);
		d.deletefront();
		d.deleterear();
		d.insertrear(25);
		d.insertfront(40);
		d.insertfront(50);
		
		System.out.println("rear element ="+d.getrear());
		System.out.println("front element="+d.getfront());
		System.out.println("front="+d.front);
		System.out.println("rear="+d.rear);
		d.display();
		
	}

	}

