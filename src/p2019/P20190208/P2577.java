package p2019.P20190208;
import java.util.Scanner;

public class P2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int mulNum = num1 * num2 * num3;
		int countNumArr[] = new int[10];
		int i = 0;
		for (i = 1; i < mulNum; i *= 10);
		i = i /= 10;
		for (i = i; i >= 0.1; i /= 10) {
			int tempNumber=mulNum/i;
			countNumArr[tempNumber] ++;
			mulNum %=i; 
		}
		for(int j=0; j<10; j++) {
			System.out.println(countNumArr[j]);
		}
	}
}
