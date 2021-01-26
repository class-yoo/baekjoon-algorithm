package p20201101;

import java.util.Scanner;

public class P9461 {
	static long[] dpArr;
	static int dpIdx;

	public static void main(String[] args) {
		dpArr = new long[101];
		dpArr[1] = dpArr[2] = dpArr[3] = 1L;
		dpIdx = 4;

		Scanner sc = new Scanner(System.in);
		int numOfCase = sc.nextInt();

		for (int i = 0; i < numOfCase; i++) 
			System.out.println(getLength(sc.nextInt()));
	}

	public static Long getLength(int N) {

		if (dpArr[N] != 0) return dpArr[N];

		for (; dpIdx <= N; dpIdx++)
			dpArr[dpIdx] = dpArr[dpIdx - 2] + dpArr[dpIdx - 3];

		return dpArr[N];
	}
}