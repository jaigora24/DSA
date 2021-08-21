package String;
import java.util.*;
public class PalindromeString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		palindromeStr(a);
		sc.close();	
	}
  //logic for palindrome string
	public static void palindromeStr(String s) {
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
			if(rev.equals(s)) System.out.println("Palindrome");
			else System.out.println("Not Palindrome");
	}

}
