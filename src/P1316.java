import java.util.HashMap;
import java.util.Scanner;

public class P1316 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Character , Boolean> map = new HashMap<>();
		int roop = sc.nextInt();
		char preWord = ' ', curWord = ' ';
		int checkJ=0;
		int count=0;
		String word = "";
		for(int i=0; i<roop; i++) {
			word = sc.next();
			for(checkJ=0; checkJ<word.length(); checkJ++) {
				curWord =word.charAt(checkJ);
				if(preWord == curWord) {
					continue;
				}else {
					if(map.containsKey(curWord)) {
						break;
					}else {
						map.put(curWord, true);
						preWord = curWord;
					}
				}
			}
			if(checkJ==word.length()) count++;
			map.clear();
		}
		System.out.println(count);
	}
}