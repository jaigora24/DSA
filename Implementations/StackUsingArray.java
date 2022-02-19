import java.util.*;
public class StackUsingArray{
	Scanner sc = new Scanner(System.in);
	int size = 10;
	int a[] = new int[size];
	int top = -1;

	public boolean isFull(){
		return size<top;
	}
	public boolean isEmpty(){
		return top<0;
	}
	
	public void push(int data){
		if(isFull()){
			System.out.println("STACK IS FULL");
		}
		else{
			top++;
			a[top]=data;
		}
	}
	
	public void pop(){
		if(isEmpty()){
			System.out.println("STACK IS EMPTY");
		}
		else{
			top--;
		}
	}
	
	public int peek(){
		return a[top];
	}

	public static void main(String[] args){
		StackUsingArray ms = new StackUsingArray();
		ms.push(10);
		ms.push(20);
		ms.push(30);
		ms.push(40);
		ms.push(50);
		System.out.println(ms.peek());
		ms.pop();
		System.out.println(ms.peek());
		ms.pop();
		ms.pop();
		System.out.println(ms.peek());
	}	
}
