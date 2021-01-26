package P20190208;
import java.util.Scanner;

public class P8958 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		String result = "";
		int preScore = 0, sum = 0;

		for (int i = 0; i < roop; i++) {
			result = sc.next();
			for (int j = 0; j < result.length(); j++) {
				if (result.charAt(j) == 'O') {
					preScore++;
					sum += preScore;
				} else {
					preScore = 0;
				}
			}
			System.out.println(sum);
			preScore=0;
			sum=0;
		}
	}
}
