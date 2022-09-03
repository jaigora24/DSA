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
		int temp[] = new int[n];
		
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(a[i]==a[j] && !visit[j]){
					temp[i]=a[i];
					visit[j]=true;
					break;
				}
			}
		}
		
		for(int i=0; i<n; i++){
			int res = a[i]-temp[i];
			if(res==0){
				continue;
			}
			else{
				System.out.print(res+" ");
			}
		}
	}
}
