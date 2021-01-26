import java.util.Scanner;

public class P2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb  = new StringBuilder();
		int roop = sc.nextInt();
		int repetition = sc.nextInt();
		String word = sc.next();
		char tempApb = ' ';
		for(int i=0 ;i<roop; i++) {
			for(int j=0; j<word.length(); j++) {
				tempApb= word.charAt(j);
				for(int k=0; k<repetition; k++) {
					sb.append(tempApb);
				}
			}
		}
		String p = sb.toString();
		System.out.println(p);
	}
}