package practise;
import java.util.Arrays;
import java.util.Scanner;
public class multiply2dMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int rowsA = sc.nextInt();
		int colsA = sc.nextInt();
		int a[][] = new int[rowsA][colsA];
		for(int i=0; i<rowsA; i++) {
			for(int j=0; j<colsA; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int rowsB = sc.nextInt();
		int colsB = sc.nextInt();
		int b[][] = new int[rowsB][colsB];
		int c[][] = new int[rowsA][colsB];
		if(colsA!=rowsB) {
			System.out.println("Not applicable");
		}
		else {
			int res = 0;
			for(int i=0; i<rowsB; i++) {
				for(int j=0; j<colsB; j++) {
					b[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0; i<rowsA; i++) {
				for(int j=0; j<colsB; j++) {
					for(int k=0; k<rowsB; k++) {
						res = res + a[i][k]*b[k][j];
					}
					c[i][j]=res;
					res=0;
				}
			}
			for(int i=0; i<rowsA; i++) {
				for(int j=0; j<colsB; j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		sc.close();		
	}
}
