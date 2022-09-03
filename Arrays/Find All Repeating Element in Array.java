import java.util.Scanner;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		boolean visit[] = new boolean[n];
		
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(a[i]==a[j] && !visit[j]){
					System.out.print(a[i]+" ");
					visit[j]=true;
					break;
				}
			}
		}
	}
}
