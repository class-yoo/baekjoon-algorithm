import java.util.Scanner;

public class P1002 {
	static public int getLocation(int x1, int y1, int r1, int x2, int y2, int r2) {

		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		} else if ((x1 == x2 && y1 == y2 && r1 != r2)
				|| (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) > r1 + r2)) {
			return 0;
		} else if (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) == r1 + r2) {
			return 1;
		} else if (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) < r1 + r2) {
			return 2;
		}

		return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int roop = sc.nextInt();

		for (int i = 0; i < roop; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			System.out.println(P1002.getLocation(x1, y1, r1, x2, y2, r2));
		}
		
		sc.close();
	}
}
