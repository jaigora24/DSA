package ds;
import java.util.*;
public class StackImplementationWithArray {
	Scanner sc = new Scanner(System.in);
	
	int size = sc.nextInt();
	int stackArray[] = new int[size];
	int top = -1;
	
	public void push(int data) {
		if(isFull()) System.out.println("Stack is full");
		else {
			top++;
			stackArray[top]=data;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else {
			int data;
			data=stackArray[top];
			stackArray[top]=0;
			top--;
			return data;
		}
	}
	public int peek() {
		return stackArray[top];
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	public boolean isFull() {
		return size<top;
	}
	public void show() {
		for(int i=size-1; i>=0; i--) {
			if(stackArray[i]==0) continue;
			System.out.println("stack is "+ stackArray[i]);
		}
	}
}
