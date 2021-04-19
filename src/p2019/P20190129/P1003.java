package p2019.P20190129;
import java.util.Scanner;
public class P1003 {
	public static void main(String[] args) {
		
		int arr [] = new int[41];
		arr[1] = 1;
		arr[2] = 1;
		for(int i=3; i<arr.length; i++ ) {
			arr[i]= arr[i-2]+arr[i-1];
		}
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		for(int i=0; i<roop; i++) {
			int number = sc.nextInt();
			if(number==0) {
				System.out.println(1+" "+0); continue;
			}
			System.out.println(arr[number-1]+" "+arr[number]);
		}
		sc.close();
	}
}
