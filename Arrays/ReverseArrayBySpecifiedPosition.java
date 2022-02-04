import java.util.Scanner;
public class ReverseArrayBySpecifiedPosition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int temp[] = new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		int index = sc.nextInt();
		for(int i=index-1; i>=0; i--){
			temp[i]=a[i];
			System.out.print(temp[i]+" ");
		}
		for(int i=index; i<n; i++){
			temp[i]=a[i];
			System.out.print(temp[i]+" ");
		}
	}
}
