package practise;
import java.util.*;
public class StackArray {
	Scanner sc = new Scanner(System.in);
	
	int size = 5;
	int [] stackArray = new int[size];
	int top = -1;

	public void push(int data) {
		if(isFull()) System.out.println("STACK IS FULL");
		else {
			top++;
			stackArray[top]=data;
		}
	}
	public int pop() {
		if(isEmpty()) System.out.println("STACK IS EMPTY");
		else {
			int data = stackArray[top];
			stackArray[top]=0;
			top--;
			return data;
		}
		return -1;
	}
	public int peek() {	
		return stackArray[top];
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top<0;
	}
	public boolean isFull() {
		return size<top;
	}
	public void show() {
		for(int i=size-1; i>=0; i--) {
			System.out.println(stackArray[i]);
		}
	}
	
	public static void main(String[] args) {

		StackArray myStack = new StackArray();
				
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		System.out.println(myStack.peek());
		myStack.pop();
		System.out.println(myStack.peek());
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		System.out.println();
		myStack.show();		
	}
}
