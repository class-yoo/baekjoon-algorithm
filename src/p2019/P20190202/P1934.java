package p2019.P20190202;
	import java.util.Scanner;
	
	public class P1934 {
	
		static int gcd(int num1, int num2) {
	
			if (num2 == 0) {
				return num1;
			} else {
				return gcd(num2, num1 % num2);
			}
		}
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	
			int roop = sc.nextInt();
	
			for (int i = 0; i < roop; i++) {
	
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int result = P1934.gcd(num1, num2);
				System.out.println((num1 * num2) / result);
			}
	
		}
	
	}
