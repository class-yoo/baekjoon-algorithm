import java.util.Scanner;

public class P1978 { //소수 구하는예제

	static boolean frime(int num) {
		if (num < 2) { // 2미만이면 소수가 아니기때문에 false 반환
			return false;
		} else {
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) { //소수가 아닐경우  false 반환
					return false;
				}
			}
		}
		return true; //소수일 경우 true 반환
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		int primeCount = 0;
		for (int i = 0; i < roop; i++) {
			if (frime(sc.nextInt()))
				primeCount++;
		}
		System.out.println(primeCount);
	}
}
