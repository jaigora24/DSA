import java.util.*;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int a = 0;
		int b = 0;
		
		String res = "";
		
		
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z'){
				res+='*';
			}
			else if(c >= 'A' && c <= 'Z'){
				res+='@';
			}
			else if(c == ' '){
				res+=' ';
			}
		}
		System.out.println(res);
	}
}
