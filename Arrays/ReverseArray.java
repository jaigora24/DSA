import java.util.Scanner;
public class ReverseArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i]+" ");
		}
	}
}
