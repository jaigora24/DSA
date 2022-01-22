import java.util.Scanner;

public class SinglyLinkedListImplementation{
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node head = null;
	int n=0;
	
	
	//insert data in the beginning of the Linked List
	public void insert_at_beginning(){
		Scanner sc = new Scanner(System.in);
		
		do{
			int data = sc.nextInt();
			Node new_node = new Node(data);
			
			if(head==null){
				head=new_node;
			}
			else{
				new_node.next=head;
				head=new_node;
			}
			System.out.println("Press 1 if you want to add more data at the beginning");
			n=sc.nextInt();
		}
		while(n==1);
	}
	
	
	//print data of the Linked List
	public void print(){
		Node temp=head;
		if(head==null){
			System.out.println("Linked List doesn't exist");
		}
		else{
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	
	public static void main(String[] args){
		
		SinglyLinkedListImplementation ll = new SinglyLinkedListImplementation();
		ll.insert_at_beginning();
		ll.print();
	}
}
