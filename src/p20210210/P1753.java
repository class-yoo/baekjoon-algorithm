package p20210210;

import java.util.*;

public class P1753 {
	static int v, e, k;
	static List<Node>[] list;
	static int[] dist;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();
		e = sc.nextInt();
		k = sc.nextInt();
		
		final int INF = 11 * v;
		list = new ArrayList[v + 1];
		dist = new int[v + 1];

		Arrays.fill(dist, INF);

		for (int i = 1; i <= v; i++) {
			list[i] = new ArrayList<>();
		}
		// 리스트에 그래프 정보를 초기화
		for (int i = 0; i < e; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int weight = sc.nextInt();
			// start에서 end로 가는 weight 가중치
			list[start].add(new Node(end, weight));
		}

		// 다익스트라 알고리즘
		dijkstra(k);
		// 출력 부분
		for (int i = 1; i <= v; i++) {
			if (dist[i] == INF)
				System.out.println("INF");
			else
				System.out.println(dist[i]);
		}
	}

	private static void dijkstra(int start) {
		PriorityQueue<Node> queue = new PriorityQueue<>();
		boolean[] check = new boolean[v + 1];
		queue.add(new Node(start, 0));
		dist[start] = 0;

		while (!queue.isEmpty()) {
			Node curNode = queue.poll();
			int cur = curNode.end;

			if (check[cur] == true)
				continue;
			check[cur] = true;

			for (Node node : list[cur]) {
				if (dist[node.end] > dist[cur] + node.weight) {
					dist[node.end] = dist[cur] + node.weight;
					queue.add(new Node(node.end, dist[node.end]));
				}
			}
		}
	}
	
}

class Node implements Comparable<Node> {
	int end, weight;

	public Node(int end, int weight) {
		this.end = end;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node o) {
		return weight - o.weight;
	}
}