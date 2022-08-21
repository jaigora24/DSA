import java.util.*;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		System.out.println(a[min-1]);
		System.out.println(a[n-max]);
	}
}
