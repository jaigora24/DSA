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
	Node top = null;
	
	public void push(int data){
		Node new_node = new Node(data);
		if(top==null){
			top=new_node;
		}
		else{
			new_node.next=top;
			top=new_node;
		}
	}
	public void pop(){
		if(top==null){
			System.out.println("Stack is Empty");
		}
		else{
			top=top.next;
		}
	}
	public void peek(){
		if(top==null){
			System.out.println("Stack is empty");
		}
		else{
			System.out.println(top.data);
		}
	}
		
	
	public static void main(String[] args){
		StackUsingLinkedLIst mystack = new StackUsingLinkedLIst();
		mystack.push(10);
		mystack.push(20);
		mystack.push(30);
		mystack.push(40);
		mystack.peek();
		mystack.pop();
		mystack.peek();
		mystack.pop();
		mystack.peek();
		mystack.push(50);
		mystack.peek();
	}
}	
