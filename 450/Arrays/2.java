import java.util.Scanner;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		
		int max = a[0];
		int min = a[0];
		
		for(int i=0; i<n; i++){
			if(a[i]<a[0]){
				max = a[i];
			}
			if(a[i]>a[0]){
				min = a[i];
			}
		}
		System.out.println(max +" "+  min);
	}
}
