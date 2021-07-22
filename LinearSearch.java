package practise;
import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int found = 0;
		
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(a[i]==x) {
				found = i;
				break;
			}
			else if(a[i]!=x){
				found = -1;
			}
		}
		if(found>=0) {
			System.out.println("FOUND at " + found);
		}else {
			System.out.println("NOT FOUND");
		}
		

		sc.close();
		
	}
}
