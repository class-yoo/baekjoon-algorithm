package p2020.p20201014;

import java.util.Arrays;
import java.util.Scanner;

public class P12865 {
	static int[] cacheWeight;

	public static int insertObject(int[][] objectArr, int index, int weight, int V) {
		if (objectArr.length <= index + 2)
			return 0;
		if (cacheWeight.length < weight)
			return 0;

		cacheWeight[weight] = V;

		if (insertObject(objectArr, index + 1, weight, V + objectArr[index + 1][1]) == 0) {
			insertObject(objectArr, index + 2, weight, V + objectArr[index + 2][1]);
		}

		return 1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		cacheWeight = new int[K];

		int[][] objectArr = new int[N][2];

		for (int i = 0; i < N; i++) {
			objectArr[i][0] = sc.nextInt();
			objectArr[i][1] = sc.nextInt();
		} //n행 2열

		insertObject(objectArr, 0, objectArr[0][0], objectArr[0][1]);

		Arrays.sort(cacheWeight);

		System.out.println(cacheWeight[cacheWeight.length - 1]);
	}

}
