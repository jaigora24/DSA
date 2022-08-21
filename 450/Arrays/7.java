import java.util.*;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		
		
		
		int b[] = new int[n];
		for(int i=0; i<n; i++){
			if(i==0){
				b[0]=a[n-1];
			}
			else{
				b[i]=a[i-1];	
			}
			System.out.print(b[i]+" ");
		}
	}
}
