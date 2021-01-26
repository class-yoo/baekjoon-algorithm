package P20190209;
import java.util.Scanner;

public class P1157 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String w = sc.next().toUpperCase();
		int arr[] = new int[26];
		int indexCheck = 0;
		for (int i = 0; i < w.length(); i++) {
			indexCheck = w.charAt(i) - 'A';
			arr[indexCheck]++;
		}
		int maxApbNumber = arr[0];
		int maxApbIdx = 0;
		char maxApb = 'A';
		for (int i = 1; i < 26; i++) {
			if (maxApbNumber != 0 && maxApbNumber == arr[i]) {
				maxApb = '?';
			} else {
				if (maxApbNumber < arr[i]) {
					maxApbNumber = arr[i];
					maxApbIdx = i;
					maxApb = (char) ('A' + maxApbIdx);
				}
			}
		}
		System.out.println(maxApb);
		sc.close();
	}
}