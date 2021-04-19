package p2019.P20190211;

import java.util.Scanner;

public class P1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		
		long data = 1;
		int dataChange = 1;
		long distance = 1;
		for (int i = 0; i < roop; i++) {
			int x= sc.nextInt();
			int y= sc.nextInt();
			distance = y-x;
			int index =1;
			while(index!=distance) {
				data++;
				for (int k = 0; k < dataChange; k++) {
					index++;
					if(index >= distance) break;
				}
				dataChange++;
			}	
			System.out.print(data);
			data = 1;
			dataChange = 1;
		}
	}
}