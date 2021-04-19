package p2019.P20190210;
import java.util.Scanner;

public class P1475 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String number =sc.next();
		number = number.replace("9", "6");
		int arr[] = new int[9];
		for (int i = 0; i < number.length(); i++) {
			arr[Integer.parseInt(number.substring(i, i + 1))]++;
		}
		if(arr[6]!=0) arr[6] = (int) Math.round((arr[6] / (double)2));
		int maxindex = 0;
		for (int i = 1; i < arr.length; i++) {
			maxindex = arr[maxindex] > arr[i] ? maxindex : i;
		}
		System.out.println(arr[maxindex]);
	}
}