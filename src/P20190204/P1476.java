package P20190204;
import java.util.Scanner;

public class P1476 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		int eCount=0, sCount=0, mCount=0;
		int year =0;
		
		while(e!=eCount || s!=sCount || m != mCount) {
			// 다같아야 false가 되기때문에 &&가 아닌 ||로 해야함
			// 하나라도 다르면 true가 됨
			eCount++; sCount++; mCount++;
			if(eCount==16) eCount=1;
			if(sCount==29) sCount=1;
			if(mCount==20) mCount=1;
			year++;
		}
		System.out.println(year);
	}
}
