import java.util.Scanner;
public class RemoveDuplicatesInplace{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int  i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]!=a[j]){
					continue;
				}
				else{
					a[j]=0;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			if(a[i]!=0){
				System.out.print(a[i]+" ");
			}
		}
	}
}
