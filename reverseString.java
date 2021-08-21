package practise;
import java.util.*;
public class main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String a = sc.nextLine();
		revStr(a);
		sc.close();
		
	}
	public static void revStr(String s) {
		char arr[] = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i]=s.charAt(i);
		}
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}

}
