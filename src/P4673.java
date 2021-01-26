import java.util.ArrayList;

public class P4673 {
	public static void main(String[] args) {

		int arr[] = new int[10000];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			int a = arr[i] / 1000;
			int b = (arr[i] - a) / 100;
			int c = (arr[i] - a - b) / 10;
			int d = arr[i] % 10;
			int number = arr[i] + a + b + c + d;
			if(number<=10000)
			list.add(number-1);
		}
		int index =0;
		for(int i=0; i<list.size(); i++) {
			arr[list.get(i)] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) System.out.println(arr[i]); 
		}
	}
}
