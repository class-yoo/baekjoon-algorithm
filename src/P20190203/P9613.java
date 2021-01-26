package P20190203;
import java.util.Scanner;

public class P9613 {
	static int gcd(int num1, int num2) {
		if (num2 == 0) return num1;
		else return gcd(num2, num1 % num2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		
		for (int i = 0; i < roop; i++) {
			int innerRoop = sc.nextInt();
			int arr [] = new int [innerRoop];
			for(int j=0; j< innerRoop; j++) {
				arr[j]= sc.nextInt();
			}
			int firstNumberIndex = 0;
			long result=0;
			for(int k=1; k< innerRoop; k++ ) {
				result+= gcd(arr[firstNumberIndex], arr[k]);
				if( firstNumberIndex==innerRoop-2) break;
				if(k==innerRoop-1) {
					firstNumberIndex++;
					k= firstNumberIndex;
				}
			}
			System.out.println(result);
		}
	}
}