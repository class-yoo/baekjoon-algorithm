package P20190130;
import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		double maxNumber = 0;
		double total = 0;
		int [] arr = new int[roop];
		
		int firstNumber = sc.nextInt();
		arr [0] = firstNumber;
		maxNumber = firstNumber;
		for (int i = 1; i < roop; i++) {
			arr[i] = sc.nextInt();
			maxNumber = Math.max(maxNumber, arr[i]);
		}
		for(int i=0; i<roop; i++) {
			total += (arr[i]/maxNumber)*100;
		}
		System.out.println(total/roop);
	}
}
