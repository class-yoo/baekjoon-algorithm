package P20190211;

import java.util.Scanner;

public class P10828 {

	public static class Node {
		int data;
		Node nextNode;
	}

	public static class MyStack {
		Node top;
		int size;

		public void push(int data) {
			if (top != null) {
				Node node = new Node();
				node.data = data;
				node.nextNode = top;
				top = node;
			} else {
				Node node = new Node();
				node.data = data;
				top = node;
			}
			size++;
		}

		public int pop() {
			if (top == null)
				return -1;
			int popData = top.data;
			size--;
			if (top.nextNode == null) {
				top = null;
				return popData;
			}
			top = top.nextNode;
			return popData;
		}

		public int size() {
			return size;
		}

		public int empty() {
			int isEmpty = top == null ? 1 : 0;
			return isEmpty;
		}

		public int top() {
			int number = top == null ? -1 : top.data;
			return number;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		MyStack stack = new MyStack();
		
		int insertData = 0;
		
		for (int i = 0; i < roop; i++) {
		
			String operate = sc.next();
			switch (operate) {
			case "push":
				insertData = sc.nextInt();
				stack.push(insertData);
				break;
			case "top":
				System.out.println(stack.top());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				System.out.println(stack.empty());
				break;
			case "pop":
				System.out.println(stack.pop());
				break;
			default:
				System.out.println(123123123);
				break;
			}
		}

	}
}
