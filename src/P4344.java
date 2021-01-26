import java.util.Scanner;

public class P4344 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();

		for (int i = 0; i < roop; i++) {
			int studentNumber = sc.nextInt();
			double total = 0;
			double overTheAveragecount = 0;
			int[] arr = new int[studentNumber];
			for (int j = 0; j < studentNumber; j++) {
				arr[j] = sc.nextInt();
				total += arr[j];
			}
			
			double avg = total / studentNumber;
			
			for (int k = 0; k < studentNumber; k++) {
				if (avg < arr[k])
					overTheAveragecount++;
			}
			
			double overTheAveragecountPercent = (overTheAveragecount / studentNumber)*100;
			System.out.println(Math.round(overTheAveragecountPercent * 1000) / 1000.000 + "%");
		}
	}
}