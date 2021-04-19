package p2019.P20190130;
import java.util.Scanner;

public class P10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int  number =sc.nextInt(); 
			if(number<x) System.out.println(number);
		}
		sc.close();
	}
}