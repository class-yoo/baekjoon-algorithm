import java.util.Scanner;

public class P1004 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		
		int penetratePlanet = 0;
		for(int i=0; i<roop; i++) {
			
			int planetNumber = sc.nextInt();
			
			for(int j=0; j<planetNumber; j++) {
				int cx = sc.nextInt();
				int cy = sc.nextInt();
				int r= sc.nextInt();
				
				int princeDistance = (int)Math.sqrt(Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2));
				int roseDistance = (int)Math.sqrt(Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2));
				
				if(r>princeDistance && r>roseDistance) {
					continue;
				}else if(r>princeDistance || r>roseDistance) {
					penetratePlanet++;
				}
			}
			System.out.println(penetratePlanet);
			penetratePlanet=0;
			
		}
		sc.close();
	}
}
