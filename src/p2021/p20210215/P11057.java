package p2021.p20210215;

import java.util.Scanner;

public class P11057 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long dp[][] = new long[n+2][10];
        
        for (int i = 0; i <= 9; i++) dp[0][i] = 1;
        for (int i = 1; i <= n; i++) dp[i][0] = 1;
        
        long[] answer = new long [n+2];
        
        for (int i = 1; i <= n+1 ; i++) {	
        	int insertNumber = 0;
			for (int j = 0; j <=9 ; j++) {
				insertNumber += (dp[i-1][j]);
				dp[i][j] = insertNumber % 10007;
			}
			
			answer[i] = insertNumber;
		}
        
        System.out.println(answer[n] % 10007);
	}
}
