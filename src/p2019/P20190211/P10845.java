package p2019.P20190211;

import java.util.Scanner;

public class P10845 {
	
	public static class Node {
		int data;
		Node nextNode;
	}
	
	public static class MyQueue {
		Node front;
		Node back;
		int size;
		public void push(int data) {
			Node newNode = new Node();
			newNode.data = data;
			size++;
			if(front == null) {
				front = newNode;
				back = newNode;
			}else {
			back.nextNode = newNode;
			back = newNode;
			}
		}
		public int pop() {
			if(front==null) return -1;
			int popData = front.data;
			size--;
			if(front.nextNode!=null) {
				front = front.nextNode;
			}else {
				front = null;
				back =null;
			}
			return popData;
		}
		public int size() {
			return size;
		}
		public int empty() {
			int isEmpty = front ==null? 1:0;  
			return isEmpty;
		}
		public int front() {
			int frontData = front == null? -1: front.data;
			
			return frontData;
		}
		public int back() {
			int backData = back == null? -1: back.data;
			
			return backData;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		MyQueue queue = new MyQueue();
		
		int insertData = 0;
		
		for (int i = 0; i < roop; i++) {
		
			String operate = sc.next();
			switch (operate) {
			case "push":
				insertData = sc.nextInt();
				queue.push(insertData);
				break;
			case "front":
				System.out.println(queue.front());
				break;
			case "back":
				System.out.println(queue.back());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				System.out.println(queue.empty());
				break;
			case "pop":
				System.out.println(queue.pop());
				break;
			default:
				break;
			}
		}
	}
}
