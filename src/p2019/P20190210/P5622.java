package p2019.P20190210;
import java.util.HashMap;
import java.util.Scanner;

public class P5622 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<>();
		int start = (int) ('A');
		int last = (int) ('O');
		int count = 1;
		int time =3;
		for (int i = start; i <= last; i++) {
			map.put((char)i, time);
			if (count % 3 == 0) {
				time++;
			}
			count++;
		}
		map.put('P', 8);
		map.put('Q', 8);
		map.put('R', 8);
		map.put('S', 8);
		map.put('T', 9);
		map.put('U', 9);
		map.put('V', 9);
		map.put('W', 10);
		map.put('X', 10);
		map.put('Y', 10);
		map.put('Z', 10);
		String word = sc.next();
		int sumTime = 0;
		for(int i=0; i<word.length(); i++) {
			sumTime+= map.get(word.charAt(i));
		}
		System.out.println(sumTime);
	}
}