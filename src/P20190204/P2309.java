package P20190204;
import java.util.Arrays;
import java.util.Scanner;

public class P2309 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int total = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		int sumNonanjangTall = total - 100;
		for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 9; j++) {
				if(arr[i]+arr[j]==sumNonanjangTall) {
					arr[i]=-1;
					arr[j]=-1;
					i=8;
					break;
				}
			}
		}
		Arrays.sort(arr);
		
		for(int i=2; i<9; i++) {
			System.out.println(arr[i]);
		}
	}
}