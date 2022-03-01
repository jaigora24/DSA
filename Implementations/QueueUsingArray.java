import java.util.*;
public class QueueUsingArray{
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int a[] = new int[size];
	int front = -1;
	int rear = -1;
	
	
	public void enqueue(int data){
		if(rear==size-1){
			System.out.println("Queue is full");
		}
		else{
			if(front == -1 && rear == -1){
				front++;
				rear++;
				a[rear]=data;
			}
			else{
				rear++;
				a[rear]=data;
			}
		}
	}
	
	public void dequeue(){
		if(front==-1 && rear==-1){
			System.out.println("Queue is empty");
		}
		else{
			front++;
		}
	}
	
	public void display(){
		for(int i=front; i<=rear; i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args){
		QueueUsingArray myqueue = new QueueUsingArray();
		myqueue.enqueue(10);
		myqueue.enqueue(20);
		myqueue.enqueue(30);
		myqueue.enqueue(40);
		myqueue.dequeue();
		myqueue.display();
	}
}
