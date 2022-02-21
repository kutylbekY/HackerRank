import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int res = 0, max = -99999999, min = 99999999;
		int[] c = new int[5];
		int[] maxes = new int[5];
		int[][] twoD = new int[5][5];
		
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		for (int i = 0; i < n; ++i) {
			switch(a[i]) {
				case(1): c[0]++;
				break;
				case(2): c[1]++;
				break;
				case(3): c[2]++;
				break;
				case(4): c[3]++;
				break;
				case(5): c[4]++;
				break;
			}
		}
		
		for (int i = 0; i < 5; ++i) {
//			System.out.print(c[i] + " ");
			if (max <= c[i]) {
				max = c[i];
				twoD[i][i] = max;
			}
			else {
				continue;
			}
		}
//		System.out.println();

		for (int i = 0; i < 5; ++i) {
			if (twoD[i][i] < max) {
				twoD[i][i] = 0;
				maxes[i] = 0;
			}
			else if (twoD[i][i] == max) {
				maxes[i] = max;
			}
		}
		
//		for (int i = 0; i < 5; ++i) {
//			for (int j = 0; j < 5; ++j) {
//				System.out.print(twoD[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < 5; ++i) {
//			System.out.print(maxes[i] + " ");
			if (maxes[i] != 0) {
				if (min > maxes[i]) {
					min = maxes[i];
					res = i + 1;
				}
			}
		}
//		System.out.println();
		
		System.out.println(res);
	}

}
