import java.util.*;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		boolean visited[] = new boolean[n];
		
		for(int i=0; i<n; i++){
			if(visited[i]==true){
				continue;
			}
			int count = 1;
			for(int j=i+1; j<n; j++){
				if(a[i]==a[j]){
					visited[j]=true;
					count++;
				}
			}
			System.out.println(a[i]+" "+count);
		}
	}
}
