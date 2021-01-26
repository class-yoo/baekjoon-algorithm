package P20190304;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DFSBFS {
	class Node {
		int number;
		ArrayList<Node> adjacent;
		boolean isVisited;

		public Node(int number) {
			this.number = number;
			adjacent = new ArrayList<>();
		}
	}

	Stack<Node> stack = new Stack<>();
	Queue<Node> queue = new LinkedList<>();

	void dfs(int startPoint, Node[] nodes) {
		nodes[startPoint].isVisited = true;
		stack.push(nodes[startPoint]);
		while (!stack.isEmpty()) {
			Node tempNode = stack.pop();
			System.out.print(tempNode.number+1+" ");
			ArrayList<Node> tempNodes =tempNode.adjacent;
			for (Node node : tempNodes) {
				if (node.isVisited == false) {
					node.isVisited = true;
					stack.push(node);
					break;
				}
			}
		}
		System.out.println();
	}

	void bfs(int startPoint, Node[] nodes) {
		nodes[startPoint].isVisited = true;
		queue.add(nodes[startPoint]);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.number+1+" ");
			ArrayList<Node> tempNodes =tempNode.adjacent;
			for (Node node : tempNodes) {
				if (node.isVisited == false) {
					node.isVisited = true;
					queue.add(node);
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		int link = sc.nextInt();
		int startPoint = sc.nextInt() - 1;
		DFSBFS main = new DFSBFS();
		Node nodes[] = new Node[point];
		for (int i = 0; i < point; i++) {
			nodes[i] = main.new Node(i);
		}

		for (int i = 0; i < link; i++) {
			int pointIndex = sc.nextInt();
			int targetPointIndex = sc.nextInt();
			nodes[pointIndex - 1].adjacent.add(nodes[targetPointIndex - 1]);
			nodes[targetPointIndex - 1].adjacent.add(nodes[pointIndex - 1]);
		}
		
		main.dfs(startPoint, nodes);
		for (int i = 0; i < point; i++) {
			nodes[i].isVisited = false;
		}
		main.bfs(startPoint, nodes);
	}

}
