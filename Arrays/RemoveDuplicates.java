import java.util.Scanner;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		
		int temp[] = new int[n];
		
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j]){
					temp[i]=a[j];
				}
			}
		}
		for(int i=0; i<a.length; i++){
			int res = a[i]-temp[i];
			if(res!=0){
				System.out.print(res+" ");
			}
		}
		
	}
}
