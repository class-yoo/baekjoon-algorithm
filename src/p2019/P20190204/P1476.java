package p2019.P20190204;
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
			// �ٰ��ƾ� false�� �Ǳ⶧���� &&�� �ƴ� ||�� �ؾ���
			// �ϳ��� �ٸ��� true�� ��
			eCount++; sCount++; mCount++;
			if(eCount==16) eCount=1;
			if(sCount==29) sCount=1;
			if(mCount==20) mCount=1;
			year++;
		}
		System.out.println(year);
	}
}
