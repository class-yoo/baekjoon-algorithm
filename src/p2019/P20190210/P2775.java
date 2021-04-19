package p2019.P20190210;
import java.util.Scanner;

public class P2775 {
	public static int getPeopleNumber(int arr [][] ,int floor, int room) {
		int sum = 0;
		for(int i=0; i<room; i++) sum+= arr[floor][i];
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		int arr [][] = null;
		for(int i = 0; i<roop; i++) {
			int floor = sc.nextInt();
			int room = sc.nextInt();
			arr = new int[floor+1][room];
			for(int zeroFloor= 0; zeroFloor<arr[0].length; zeroFloor++) {
				arr[0][zeroFloor] = zeroFloor+1;
			}
			for(int j=1; j<arr.length;j++ ) {
				for(int k=0; k<arr[0].length; k++) {
					arr[j][k] = getPeopleNumber(arr, j-1, k+1);
				}
			}
			System.out.println(arr[floor][room-1]);
		}
		
	}
}