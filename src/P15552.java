import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P15552 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int roop = Integer.parseInt(br.readLine());
			for (int i = 0; i < roop; i++) {
				String [] numbers = br.readLine().split(" ");
				int sum =Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
				bw.write(sum+"\n");
				bw.flush();
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}