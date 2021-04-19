package p2021.p20210102;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P12015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		list.add(0);

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();

			if (list.get(list.size() - 1) < number) {
				list.add(number);
			} else {
				int left = 0, right = list.size() - 1;
				while (left < right) {
					int mid = (left + right) / 2;
					if (list.get(mid) < number) {
						left = mid + 1;
					} else {
						right = mid;
					}
				}
				list.set(left, number);

			}
		}

		System.out.println(list.size()-1);
	}
}
