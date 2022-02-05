import java.util.Scanner;
public class ReverseStringByWords{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String smallstr[] = str.split(" ");
		
		String revword;
		String revstr = "";
		
		
		for(int i=0; i<smallstr.length; i++){
			String word = smallstr[i];
			revword = "";
			
			for(int j=word.length()-1; j>=0; j--){
				revword = revword + word.charAt(j);
			}
			revstr=revstr+revword+" ";
		}
		System.out.println(revstr);
	}
}
