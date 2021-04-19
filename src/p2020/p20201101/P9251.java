package p2020.p20201101;

import java.util.Scanner;

public class P9251 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();

		int countArr[][] = new int[word1.length() + 1][word2.length() + 1];

		for (int i = 1; i <= word1.length(); i++) {
			for (int j = 1; j <= word2.length(); j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					countArr[i][j] = countArr[i - 1][j - 1] + 1;
					continue;
				}
				countArr[i][j] = Math.max(countArr[i][j - 1], countArr[i - 1][j]);
			}
		}
		
		System.out.println(countArr[word1.length()][word2.length()]);

	}
}
