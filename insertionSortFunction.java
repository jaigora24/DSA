package practise;
import java.util.*;
public class insertionSortFunction {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = insertionSort(new int[] {5,6,3,7,9,1,2,0,4,8});
		for(int e:arr) {
			System.out.print(e+" ");
		}
		sc.close();		
	}
	
	public static int [] insertionSort(int [] a) {
		for(int i=1; i<a.length; i++) {
			int temp = a[i];
			int j = i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		return a;
	}
}
