package p2019.P20190310;

import java.util.Scanner;

public class P11726 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int arr[] = new int[number];
		arr[0] = 1;
		if (number > 1) arr[1] = 2;
		for (int i = 2; i < number; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2])%10007;
		}
		System.out.println(arr[number-1]);
		sc.close();
		
	}
}
