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
	
	
	//insert data in the Linked List
	public void insertion(){
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Enter Data : ");
			int data = sc.nextInt();
			Node new_node = new Node(data);
			Node temp = head;
			
			if(head==null){
				head=new_node;
			}
			else{
				
				System.out.println("Press 1 to insert data at beginning \n Press 2 to insert data at end \n Press 3 to insert data at specific location");
				System.out.println("Enter your choice : ");
				int choice = sc.nextInt();
				switch(choice){
					case(1):
						new_node.next=head;
						head=new_node;
						break;
					case(2):
						temp=head;
						while(temp.next!=null){
							temp=temp.next;
						}
						temp.next=new_node;
						new_node.next=null;
						break;
					case(3):
						System.out.println("Enter the position : ");
						int position = sc.nextInt();
						temp=head;
						for(int i=1; i<position-1; i++){
							temp=temp.next;
						}
						new_node.next=temp.next;
						temp.next=new_node;
						break;
				}

				
			}
			System.out.println("Press 1 if you want to add more data");
			n=sc.nextInt();
		}
		while(n==1);
	}
	
	
	
	
	//delete data from the Linked List
	public void deletion(){
		Scanner sc = new Scanner(System.in);
		Node temp = head;
		
		do{
			if(head==null){
				System.out.println("Linked List is Empty");
			}
			else{
				System.out.println("1. Beginning     2. Ending     3. Specific");
				System.out.println("Enter your choice : ");
				int choice = sc.nextInt();
				
				switch(choice){
					case(1):
						temp = head;
						temp=temp.next;
						head=temp;
						break;
					
					case(2):
						temp = head;
						Node ptr = temp.next;
						while(ptr.next!=null){
							temp=ptr;
							ptr=ptr.next;
						}
						temp.next=null;
						break;
					
					case(3):
						System.out.println("Enter the location where you want to add : ");
						int loc = sc.nextInt();
						
						temp=head;
						ptr=temp.next;
						for(int i=1; i<loc-1; i++){
							temp=ptr;
							ptr=ptr.next;
						}
						temp.next=ptr.next;
						break;
					
				}
			}
			System.out.println("Press 1. if you want to delete more data");
			n = sc.nextInt();
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
		ll.insertion();
		ll.deletion();
		ll.print();
	}
}
