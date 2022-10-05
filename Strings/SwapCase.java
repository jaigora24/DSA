import java.util.Scanner;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String temp = "";
		
		for(int i=0; i<str.length(); i++){
			char c;
			if(Character.isLowerCase(str.charAt(i))){
				c=Character.toUpperCase(str.charAt(i));
				temp+=c;
			}
			if(str.charAt(i)==' '){
				temp+=" ";
			}
			if(Character.isUpperCase(str.charAt(i))){
				c=Character.toLowerCase(str.charAt(i));
				temp+=c;
			}
		}
		System.out.println(temp);
	}
}
