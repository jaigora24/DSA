import java.util.Scanner;
public class SumProductInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		int product = 1;
		for(int i=0; i<n; i++){
			sum=sum+arr[i];
			product=product*arr[i];
		}
		System.out.println(sum);
		System.out.println(product);
	}
}
