import java.util.Scanner;
public class ArrayImplementation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter length of array ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter values in array");
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		
		// insert at given index
		int b[] = new int[n+1];
		System.out.println("Enter index");
		int index = sc.nextInt();
		System.out.println("Enter value");
		int value = sc.nextInt();
		
		for(int i=0; i<n+1; i++){
			if(i<index){
				b[i]=a[i];
			}
			else if(i==index){
				b[i]=value;
			}
			else{
				b[i]=a[i-1];
			}
		}
		
		//print after inserting
		for(int i=0; i<n+1; i++){
			System.out.print(b[i]+" ");
		}
		
		
		//deleting element at given index
		int b[] = new int[n-1];
		System.out.println("Enter index");
		int index = sc.nextInt();
		
		for(int i=0; i<n; i++){
			if(i<index){
				b[i]=a[i];
			}
			else if(i==index){
				continue;
			}
			else{
				b[i-1]=a[i];
			}
		}	
		
		//print after deleting
		for(int i=0; i<n-1; i++){
			System.out.print(b[i]+" ");
		}
		
	}
}
