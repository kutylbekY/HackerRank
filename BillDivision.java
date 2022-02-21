import java.util.Scanner;

public class BillDivision {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chargeAnne = 0;
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; ++i) {
			a[i] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		scanner.close();
		
		for (int i = 0; i < n; ++i) {
			if (k != i) {
				chargeAnne += a[i];
			}
		}
		chargeAnne /= 2;
		
		if (b == chargeAnne) {
			System.out.println("Bon Appetit");
		}
		else {
			System.out.println(b - chargeAnne);
		}
		
		
		

	}

}
