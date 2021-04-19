package p2019.P20190208;
import java.util.Scanner;

public class P1152 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		if(words.equals("") || words.equals(" ")) {
			System.out.println(0);
			return;
		}
		String wordArr [] = words.split(" ");
		int wordsNumber = wordArr.length;
		if(words.startsWith(" ")||wordArr[wordArr.length-1].equals(" ")) wordsNumber--;
			
		System.out.println(wordsNumber);
		sc.close();
	}
}