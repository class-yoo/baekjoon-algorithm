package P20190208;
import java.util.Scanner;

public class P2920B {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ascCheck = 1;
		int dscCheck = 8;
		int number = 0;
		String result = "";
		for(int i=0; i<8; i++) {
			number = sc.nextInt();
			if(ascCheck++ == number && result.equals("ascending")) result = "ascending";
			else if(dscCheck-- == number && result.equals("descending")) result = "descending";
			else {
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
	}
}
