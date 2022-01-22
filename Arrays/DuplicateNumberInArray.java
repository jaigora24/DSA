import java.util.Scanner;
public class DuplicateNumberInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        // input array
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		
        //outer loop iterate from 0 to array length & the inner loop will used to compare the selected element from rest of the array 
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
				}
			}
		}
	}
}
