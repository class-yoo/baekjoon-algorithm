package p2021.p03.p20210317;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1260 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();

		boolean[][] map = new boolean[n + 1][n + 1];

		for (int i = 1; i <= m; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			map[num1][num2] = true;
			map[num2][num1] = true;
		}

		boolean[] isVisited = new boolean[n + 1];
		dfs(map, isVisited, v);
		System.out.println();
		isVisited = new boolean[n+1];
		bfs(map, isVisited, v);
		
	}

	public static void dfs(boolean[][] map, boolean[] isVisited, int curIndex) {
		if (isVisited[curIndex] == true)
			return;

		isVisited[curIndex] = true;

		System.out.print(curIndex + " ");

		for (int i = 1; i < map.length; i++) {
			if (map[curIndex][i] == true && isVisited[i] == false) {
				dfs(map, isVisited, i);
			}
		}
	}

	public static void bfs(boolean[][] map, boolean[] isVisited, int curIndex) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(curIndex);
		while (!queue.isEmpty()) {
			int v = queue.poll();
			if (isVisited[v] == false) {
				isVisited[v] = true;
				System.out.print(v + " ");
				for (int i = 1; i < map.length; i++) {
					if (map[v][i] == true
							&& isVisited[i] == false) {
						queue.add(i);
					}
				}
			}
		}
	}
}
