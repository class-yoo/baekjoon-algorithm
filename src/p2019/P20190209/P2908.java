package p2019.P20190209;
import java.util.Scanner;

public class P2908 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int arr [] = {num1, num2};
		for(int i=0; i<2; i++) {
			int number =arr[i];
			int h = number/100;
			int t = (number%100)/10;
			int o = number%10;
			arr[i]= 100*o + 10*t + 1*h;
		}
		
		System.out.println(Math.max(arr[0], arr[1]));
	}
}
