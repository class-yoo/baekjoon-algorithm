package p2019.P20190208;
import java.util.Scanner;

public class P2920 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int preNumber = sc.nextInt();
		int curNumber = 0;
		String result = "";
		if(preNumber ==1) result = "ascending";
		else if(preNumber ==8) result ="descending";
		else result = "mixed";
		for(int i=0; i<7; i++) {
			curNumber = sc.nextInt();
			if(curNumber-preNumber==1 && result.equals("ascending")) {
				result = "ascending";
				preNumber = curNumber;
			}else if(curNumber-preNumber==-1 && result.equals("descending")) {
				result = "descending";
				preNumber = curNumber;
			}else {
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
	}
}