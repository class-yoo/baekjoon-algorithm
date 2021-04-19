package p2019.P20190209;
import java.util.Scanner;

public class P10809 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String voca = sc.next();
		int alphabetArr [] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		for(int i=0; i<voca.length(); i++) {
			int temp = voca.charAt(i)-'a';
			if(alphabetArr[temp]==-1) alphabetArr[temp]=i;
		}
		for(int i=0; i<26; i++) System.out.print(alphabetArr[i]+" ");
		sc.close();
	}
}