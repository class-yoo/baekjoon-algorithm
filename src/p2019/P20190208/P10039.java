package p2019.P20190208;
import java.util.Scanner;

public class P10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, score= 0;
		for (int i = 0; i < 5; i++) {
			score = sc.nextInt();
			sum += score > 40 ? score : 40;
		}
		System.out.println(sum/5);
		sc.close();
	}
	
}
