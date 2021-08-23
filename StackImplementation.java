package dataStructures;
import java.util.Scanner;

public class StackImplementation {
	Scanner sc = new Scanner(System.in);
	
	int size = sc.nextInt();
	int stackArray[] = new int[size];
	int top = 0;
	
        
        //push method
	public void push(int data) {
		if(isFull()) System.out.println("Stack is full");
		else {
			stackArray[top] = data;
			top++;
		}
	}
	
        
        //pop method
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			int data;
			top--;
			data = stackArray[top];
			stackArray[top]=0;
			return data;
		}
	}
	
        
        //peek method
	public int peek() {
		int data;
		data = stackArray[top-1];
		return data;
	}
	
        
        //show method
	public void show() {
		for(int n:stackArray) {
			System.out.println(n);
		}
	}
        
        
        //size method
	public int size() {
		return top;
	}
        
        //isEmpty method
	public boolean isEmpty() {
		return top<=0;
	}
        
        //isFull method
	public boolean isFull() {
		return size-1==top;
	}
	

}
