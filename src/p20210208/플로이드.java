package p20210208;

import java.util.Scanner;

public class 플로이드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] map = new int[n + 1][n + 1];

		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				if (i != j) {
					map[i][j] = (n+1) * 100000;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			int cityA = sc.nextInt();
			int cityB = sc.nextInt();
			int cost = sc.nextInt();

			map[cityA][cityB] = Math.min(cost, map[cityA][cityB]);
		}
		
		for (int k = 1; k < map.length; k++) {
			for (int i = 1; i < map.length; i++) {
				for (int j = 1; j < map.length; j++) {
					if(map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j]; 
					}
				}
			}
		}
		
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map.length; j++) {
				if (map[i][j] == (n+1) * 100000) {
					map[i][j] = 0;
				}
				System.out.print(map[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
