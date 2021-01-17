import java.util.Scanner;

public class MainQueue {
	public static void main(String args[]){
		System.out.println("Enter the SIZE of queue");
		Scanner scan=new Scanner(System.in);
		
		int size=scan.nextInt();
		Queue Q=new Queue(size);
		int c = 0;
		do{
			
			System.out.println("\tQUEUE");
			System.out.println("1. Enter Element");
			System.out.println("2. Delete Element");
			System.out.println("3. Display Element");
			System.out.println("4. Exit");
			c=scan.nextInt();
			switch(c)
			{
				case 1: if(!Q.isFull())
						{
							System.out.println("Enter the element to be inserted");
							int x=scan.nextInt();
							Q.EnQueue(x);
						}
							
						break;
				case 2: Q.DeQueue(); break;
				case 3: Q.Display();break;
				case 4:
				default:System.out.println("Enter a valid optin");
			}
		}while(c!=4);
		scan.close();
			
	}

}


class Queue{
	
	int front;
	int rear;
	int size;
	int[] Q;
	Queue(int size)
	{
		front=-1;
		rear=-1;
		this.size=size;
		Q=new int[size];
	}
	
	void EnQueue(int x){
		if(rear==-1)
			rear=front=0;
		else
			rear++;
		Q[rear]=x;
	}
	
	void DeQueue(){
		if(front==-1){
			System.out.println("No elemnts\nUNDERFLOW!!!!!");
			return;
		}
		System.out.println("Element returned = "+Q[front]);
		if(rear==front)
			rear=front=-1;
		else
			front++;
		
	}
	
	boolean isFull(){
		if(rear==size-1)
		{
			System.out.println("Queue OVERFLOW!!!!");
			return true;
		}
		return false;
	}
	
	void Display(){
		for(int i=front;i<=rear;i++)
			System.out.println("    "+Q[i]);
	}
}

/*
Enter the SIZE of queue
3
	QUEUE
1. Enter Element
2. Delete Element
3. Display Element
4. Exit
1
Enter the element to be inserted
3
	QUEUE
1. Enter Element
2. Delete Element
3. Display Element
4. Exit
1
Enter the element to be inserted
5
	QUEUE
1. Enter Element
2. Delete Element
3. Display Element
4. Exit
1
Enter the element to be inserted
4
	QUEUE
1. Enter Element
2. Delete Element
3. Display Element
4. Exit
1
Queue OVERFLOW!!!!
	QUEUE
1. Enter Element
2. Delete Element
3. Display Element
4. Exit
3
    3
    5
    4
	QUEUE
1. Enter Element
2. Delete Element
3. Display Element
4. Exit
2
Element returned = 3
	QUEUE
1. Enter Element
2. Delete Element
3. Display Element
4. Exit
3
    5
    4
	QUEUE
1. Enter Element
2. Delete Element
3. Display Element
4. Exit
4
*/
