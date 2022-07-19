import java.util.Scanner;
public class LinkedList{
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	
	
	Node head = null;
	
	
	
	public void insertAtBegin(int data){
		Node new_node = new Node(data);
		Node temp = head;
		if(head==null){
			head=new_node;
		}
		else{
			new_node.next=head;
			head=new_node;
		}
	}
	
	
	
	public void insertAtLast(int data){
		Node new_node = new Node(data);
		Node temp = head;
		
		if(head==null){
			head=new_node;
		}
		else{
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new_node;
			new_node.next=null;
		}
	}
	
	
	
	public void insertAtSpecific(int data, int pos){
		Node new_node= new Node(data);
		Node temp = head;
		if(head==null){
			new_node=head;
		}
		else{
			for(int i=1; i<pos-1; i++){
				temp=temp.next;
			}
			new_node.next=temp.next;
			temp.next=new_node;
		}
	}
		
		
	
	public void deleteAtBegin(){
		Node temp = head;
		
		if(head==null){
			System.out.println("Linked List is empty");
		}
		else{
			temp=temp.next;
			head=temp;
		}
	}
	
	
	
	public void deleteAtLast(){
		Node temp = head;
		Node ptr = temp.next;
		if(head==null){
			System.out.println("Linked List doesn't exists");
		}
		else{
			while(ptr.next!=null){
				temp=ptr;
				ptr=ptr.next;
			}
			temp.next=null;
		}
	}
	
	
	
	public void deleteAtSpecific(int pos){
		Node temp = head;
		Node ptr = temp.next;
		if(head==null){
			System.out.println("Linked List doesn't exists");
		}
		else{
			for(int i=1; i<pos-1; i++){
				temp=ptr;
				ptr=ptr.next;
			}
			temp.next=ptr.next;
		}
	}
	
	
	
	public void print(){
		Node temp = head;
		if(head==null){
			System.out.println("Linked List doesn't exists");
		}
		else{
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	
	
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.insertAtBegin(10);
		ll.insertAtBegin(20);
		ll.insertAtBegin(30);
		ll.insertAtLast(40);
		ll.insertAtLast(50);
		ll.insertAtSpecific(60,3);
		ll.insertAtSpecific(70,3);
		ll.deleteAtBegin();
		ll.deleteAtLast();
		ll.deleteAtSpecific(3);
		
		ll.print();
	}
}
