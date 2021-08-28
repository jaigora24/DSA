package dataStructures;
import java.util.Scanner;
public class QueueArray {

Scanner sc = new Scanner(System.in);
	
	int size = 5;
	int [] queueArray = new int[size];
	int front = 0;
	int rear = -1;

	public void enqueue(int data) {
		if(isFull()) System.out.println("Queue is full");
		else {
			rear++;
			queueArray[rear]=data;
		}
	}
	public int dequeue() {
		if(isEmpty()) System.out.println("Queue is empty");
		else {
			int data = queueArray[front];
			queueArray[front]=0;
			front++;
			return data;
		}
		return -1;
	}
	public int peek() {	
		return queueArray[front];
	}
	public int size() {
		return rear;
	}
	public boolean isEmpty() {
		return rear<0;
	}
	public boolean isFull() {
		return size<rear;
	}
	public void show() {
		for(int i=size-1; i>=0; i--) {
			System.out.println(queueArray[i]);
		}
	}
	
	public static void main(String[] args) {	
		QueueArray myQueue = new QueueArray();
		
		myQueue.enqueue(10);
		myQueue.enqueue(20);
		myQueue.enqueue(30);
		myQueue.enqueue(40);
		System.out.println(myQueue.peek());
		myQueue.dequeue();
		System.out.println(myQueue.peek());
		System.out.println();
		myQueue.show();	
	}
}
