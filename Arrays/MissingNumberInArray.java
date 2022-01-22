import java.util.Scanner;
public class MissingNumberInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		int sum = ((n+1)*(n+2))/2;     //sum of first n numbers in given range
		
		for(int i=0; i<n; i++){
			sum=sum-arr[i];            //subtract each term from sum & the left part is our answer
		}
		System.out.println(sum);
	}
}
