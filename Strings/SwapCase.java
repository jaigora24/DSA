import java.util.Scanner;
public class SwapCase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String temp = "";
		
		for(int i=0; i<str.length(); i++){
			
			char c = str.charAt(i);
			if(Character.isUpperCase(c)){
				c = Character.toLowerCase(c);
				temp+=c;
			}
			else if(str.charAt(i)==' '){
				temp+=' ';
			}
				
		    else if(Character.isLowerCase(c)){
				c = Character.toUpperCase(c);
				temp+=c;
			}
		}
		System.out.println(temp);
	}
}
