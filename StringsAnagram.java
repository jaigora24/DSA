package practise;
import java.util.*;
public class main {
	
	public static void main(String[] args) {
		
		String s1 = "aba";
		String s2 = "abb";
		if(anagram(s1,s2)) {
			System.out.println("ANAGRAM");
		}
		else {
			System.out.println("NOT ANAGRAM");
		}
    }
	
	public static boolean anagram(String a, String b) {
		boolean isAnagram = false;
		boolean visited [] = new boolean[b.length()];
		if(a.length()==b.length()) {
			for(int i=0; i<a.length(); i++) {
				char c = a.charAt(i);
				isAnagram = false;
				for(int j=0; j<b.length(); j++) {
					if(b.charAt(j)==c && !visited[j]) {
						visited[j]=true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram) break;
			}
		}
		return isAnagram;
	}
}
