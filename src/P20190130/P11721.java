package P20190130;
import java.util.Scanner;

public class P11721 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		
		for(int i=0; i<sentence.length(); i=i+10) {
			
			if(i+10>sentence.length()) {
				System.out.print(sentence.substring(i, sentence.length()));
				break;
			}else {
				System.out.println(sentence.substring(i, i+10));
			}
		}
		sc.close();
	}
}
