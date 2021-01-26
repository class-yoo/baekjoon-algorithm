
public class P9095 {

	static int go(int sum, int goal) {

		if (sum > goal)
			return 0;
		if (sum == goal)
			return 1;
		int now = 0;
		for (int i = 1; i <= 3; i++) {
			now += go(sum + i, goal);
		}
		
		return now;
	}

	public static void main(String[] args) {
		
		System.out.println(go(0, 4));
	}
}
