import java.util.Scanner;
public class RemoveDuplicates{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[n];
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					temp[i]=arr[i];
				}
			}
		}
		for(int i=0; i<n; i++){
			int res = arr[i]-temp[i];
			if(res!=0){
				System.out.print(res+" ");
			}
		}
	}
}
