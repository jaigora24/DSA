package ds.Stack;
public class Stack {
	
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new int[maxSize];
		this.top = -1;
	}
	public void push(int j) {
		if(isFull()) System.out.println("Stack is full");
		else {
			top++;
			stackArray[top]=j;
		}
	}
	public long pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return  -1;
		}
		else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}
	public long peek() {
		return stackArray[top];
	}
	public boolean isFull() {
		return (maxSize-1==top);
	}
	public boolean isEmpty() {
		return (top==-1);
	}	
}
