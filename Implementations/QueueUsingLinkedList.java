import java.util.Scanner;
public class QueueUsingLinkedList{
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node front = null;
	Node rear = null;
	
	
	public void enqueue(int data){
		Node new_node = new Node(data);
		
		if(front==null){
			rear=new_node;
			front=new_node;
		}
		else{
			rear.next=new_node;
			rear=new_node;
		}
	}
	
	public void dequeue(){
		if(front==null){
			System.out.println("Queue is empty");
		}
		else{
			front=front.next;
		}
	}
	
	public void display(){
		Node temp = front;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args){
		QueueUsingLinkedList myqueue = new QueueUsingLinkedList();
		myqueue.enqueue(10);
		myqueue.enqueue(20);
		myqueue.enqueue(30);
		myqueue.enqueue(40);
		myqueue.dequeue();
		myqueue.display();
	}
}
