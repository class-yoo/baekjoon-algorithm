import java.util.Scanner;

public class P1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gap = Math.max(num1, num2);
		int prime[] = new int[gap]; // 소수 저장 
		int pn=0; // 소수의 개수 
		boolean check[] = new boolean[gap+1]; // 지워졌으면 true 
		
		for (int i=2; i<=num2; i++) {
			if (check[i] == false) {
				prime[pn++] = i;
				for (int j = i*2; j<=num2; j+=i) {
					check[j] = true; 
					} 
				} 
			}
		for( int i=0; i<prime.length; i++) {
			if(num1<=prime[i]) {
				System.out.println(prime[i]);
			}
		}
	}
}