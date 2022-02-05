import java.util.Scanner;
public class FindDuplicates{
	public static void findDuplicates(String str){
		
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<str.length(); j++){
				if(str.charAt(i)==str.charAt(j)){
					if(str.charAt(i)==' '){
						continue;
					}
					System.out.print(str.charAt(j)+" ");
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String s = sc.nextLine();	
		findDuplicates(s);	
	}
}
