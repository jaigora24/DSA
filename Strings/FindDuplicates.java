import java.util.Scanner;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		boolean visited[] = new boolean[str.length()];
		
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<str.length(); j++){
				if(str.charAt(i)==str.charAt(j) && !visited[j]){
					if(str.charAt(i)==' '){
						continue;
					}
					visited[j]=true;
					System.out.print(str.charAt(i)+" ");
				}
			}
		}
	}
}
