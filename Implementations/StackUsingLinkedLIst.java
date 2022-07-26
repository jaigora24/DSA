import java.util.Scanner;
public class StackUsingLinkedLIst{
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head = null;
	public void push(int data){
		Node new_node = new Node(data);
		if(head==null){
			head=new_node;
		}
		else{
			new_node.next=head;
			head=new_node;
		}
	}
	
	public void pop(){
		Node temp = head;
		if(head==null){
			System.out.println("STACK IS EMPTY");
		}
		else{
			temp=temp.next;
			head=temp;
		}
	}
	
	public void peek(){
		if(head==null){
			System.out.println("STACK IS EMPTY");
		}
		else{
			System.out.println(head.data);
		}
	}
	
	public static void main(String[] args){
		StackUsingLinkedLIst mystack = new StackUsingLinkedLIst();
		
		mystack.push(10);
		mystack.push(20);
		mystack.push(30);
		mystack.push(40);
		mystack.push(50);
		mystack.pop();
		mystack.peek();
		mystack.push(60);
		mystack.peek();
	}
}
