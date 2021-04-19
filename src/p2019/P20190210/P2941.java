package p2019.P20190210;
import java.util.Scanner;

public class P2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String arr[] = { "dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z=" };
		for(int i=0; i<arr.length; i++) {
			if(word.contains(arr[i])) word =word.replace(arr[i], "@");
		}
		System.out.println(word.length());
	}
}