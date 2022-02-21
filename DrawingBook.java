import java.util.Scanner;

public class DrawingBook {

	static int min (int a, int b) {
		if (a >= b) {
			return b;
		}
		else {
			return a;
		}
	}
	
	static boolean even(int n) {
		if (n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static int counterBack (int n, int p, int c) {
		while (n != p) {
			if (even(p) == true && n == p + 1) {
				break;
			}
			else if (even(p) == false && n == p - 1) {
				break;
			}
			else {
				c++;
				n -= 2;
			}
		}
		return c;
	}
	
	static int counterFront (int n, int p, int c) {
		while (n != p) {
			if (even(p) == true && n == p + 1) {
				break;
			}
			else if (even(p) == false && n == p - 1) {
				break;
			}
			else {
				c++;
				n += 2;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int countBack = 0, countFront = 0;
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		scanner.close();
		
		if (n == p ) {
			System.out.println(0);
		}
		else if (n % 2 == 0) {
			countBack = counterBack(n - 1, p, 1);
			countFront = counterFront(1, p, countFront);
			System.out.println(min(countBack, countFront));
			
		}
		else {
			countBack = counterBack(n, p, countBack);
			countFront = counterFront(1, p, countFront);
			System.out.println(min(countBack, countFront));
		}

	}

}
