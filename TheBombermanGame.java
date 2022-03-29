import java.util.Scanner;
import java.lang.Math;

public class TheBombermanGame {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt(), c = scanner.nextInt(), n = scanner.nextInt();
        char[][] s = new char[r + 2][c + 2];
        char[][] even = new char[r + 2][c + 2];
        char[][] three = new char[r + 2][c + 2];
        char[][] five = new char[r + 2][c + 2];
        String s1;
        
        for (int i = 1; i <= r; i++) {
			s1 = scanner.next();
    		int k = 0;
        	for (int j = 1; j <= c; ++j) {
        		s[i][j] = s1.charAt(k);
        		k++;
        		if (s[i][j] == 'O') {
        			three[i][j] = '.';
        			three[i - 1][j] = '.';
        			three[i + 1][j] = '.';
        			three[i][j - 1] = '.';
        			three[i][j + 1] = '.';
        		}
        		else if (three[i][j] != '.'){
            		three[i][j] = 'O';
        		}
        		five[i][j] = 'O';
        		even[i][j] = 'O';
        	}
        }
        
        for (int i = 1; i <= r; i++) {
        	for (int j = 1; j <= c; ++j) {
        		if (three[i][j] == 'O') {
        			five[i][j] = '.';
        			five[i - 1][j] = '.';
        			five[i + 1][j] = '.';
        			five[i][j - 1] = '.';
        			five[i][j + 1] = '.';
        		}
        	}
        }
        
        if (n % 2 == 0) {
            for (int i = 1; i <= r; i++) {
            	for (int j = 1; j <= c; ++j) {
            		System.out.print(even[i][j]);
            	}
            	System.out.println();
            }
        }
        else if (n == 1) {
            for (int i = 1; i <= r; i++) {
            	for (int j = 1; j <= c; ++j) {
            		System.out.print(s[i][j]);
            	}
            	System.out.println();
            }
        }
        else {
        	if (n != 3 || n != 5) {
            	while (n > 6)  {
            		n -= 4;
            	}
        	}
        	if (n == 3) {
                for (int i = 1; i <= r; i++) {
                	for (int j = 1; j <= c; ++j) {
                		System.out.print(three[i][j]);
                	}
                	System.out.println();
                }
        	}
        	else if (n == 5) {
                for (int i = 1; i <= r; i++) {
                	for (int j = 1; j <= c; ++j) {
                		System.out.print(five[i][j]);
                	}
                	System.out.println();
                }
        	}
        }
	}

}
