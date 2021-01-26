package p20201011;

import java.util.Scanner;

public class p15649 {

	int n, m;
	int arr[] = new int[10];
	boolean isused[] = new boolean[10];

	void func(int k) {
		if (k == this.m) {
			for (int i = 0; i < this.m; i++) {
				System.out.print(this.arr[i]+ "  ");
			}
			System.out.println();
			
			return;
		}

		for (int i = 1; i <= this.n; i++) {
			if (!this.isused[i]) {
				this.arr[k] = i;
				this.isused[i] = true;
				func(k + 1);
				this.isused[i] = false;
			}
		}
	}
	
	
	void start(int n, int m) {
		this.n = n;
		this.m = m;

		func(0);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		p15649 p15649 = new p15649();
		p15649.start(n, m);
	}

}
