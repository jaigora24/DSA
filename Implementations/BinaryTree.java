import java.util.*;
public class BinaryTree{
	static class Node{
		Node left, right;
		int data;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static Node create(){
		Scanner sc = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter value : ");
		int data = sc.nextInt();
		if(data==-1){
			return null;
		}
		root = new Node(data);
		System.out.println("Left Child of " + root);
		root.left=create();
		System.out.println("Right Child of " + root);
		root.right=create();
		return root;
	}
	
	public static void main(String[] args){
		Node root = create();
	}
}
