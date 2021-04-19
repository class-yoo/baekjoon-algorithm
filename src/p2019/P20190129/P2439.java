package p2019.P20190129;
import java.util.Scanner;

public class P2439 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		String star = "*";
		String blank = "";
		for(int i=1; i<roop; i++) {
			blank+=" ";
		}
		for (int i = 0; i < roop; i++) {
			System.out.println(blank.substring(0, roop-1-i)+star);
			star+="*";
		}
	}

}
