	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node head = null;
	
	public void insertionAtBegin(int data){
		Node new_node = new Node();
		Node temp = head;
		if(head==null){
			head=new_node;
		}
		else{
			new_node.next=head;
			head=new_node;
		}
	}
		
	public void insertionAtLast(int data){
		Node new_node = new Node(data);
		Node temp = head;
		if(head==null){
				head=new_node;
		}
		else{
			temp.next=new_node;
			new_node.next=null;
		}
	}
	
	public void insertionAtSpecific(int n, int data){
		Node new_node = new Node();
		Node temp = head;
		for(int i=1; i<n-1; i++){
			temp=temp.next;
		}
		new_node.next=temp.next;
		temp.next=new_node;
	}
	
	public void deleteAtBegin(){
		Node temp = head;
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			temp=temp.next;
			head=temp;
		}
	}
	
	public void deleteAtLast(){
		Node temp = head;
		if(head==null){
			System.out.println("List is Enmpty");
		}
		else{
			Node ptr=temp.next;
			while(ptr.next!=null){
				temp=ptr;
				ptr=ptr.next;
			}
			temp.next=null;
		}
	}
	
	
	public void deleteAtSpecific(int n){
		Node temp = head;
		Node ptr=temp.next;
		for(int i=1; i<n-1; i++){
			temp=ptr;
			ptr=ptr.next;
		}
		temp.next=ptr.next;
	}
