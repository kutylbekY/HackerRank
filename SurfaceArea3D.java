import java.util.Scanner;
import java.lang.Math;

public class SurfaceArea3D {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(), w = scanner.nextInt();
        int[][] a = new int[h + 2][w + 2];
        long ans = 0;
//        System.out.println();
//        System.out.println("Original ans: " + ans);
        
        for (int i = 1; i <= h; ++i) {
        	for (int j = 1; j <= w; ++j) {
                a[i][j] = scanner.nextInt();
                if (a[i][j] != 0) {
                	ans += 2;
                }
        	}
        }

        for (int i = 1; i <= h; ++i) {
        	for (int j = 1; j <= w; ++j) {
        		
        		if (i == 1 && j == 1) {
        			ans += Math.abs(a[i][j] - a[i][j + 1]);
        			ans += Math.abs(a[i][j] - a[i][j - 1]);
        			ans += Math.abs(a[i][j] - a[i + 1][j]);
        			ans += Math.abs(a[i][j] - a[i - 1][j]);
        		}
        		else if (i == 1 && j != 1) {
        			ans += Math.abs(a[i][j] - a[i][j + 1]);
        			ans += Math.abs(a[i][j] - a[i + 1][j]);
        			ans += Math.abs(a[i][j] - a[i - 1][j]);
        		}
        		else if (i != 1 && j == 1) {
        			ans += Math.abs(a[i][j] - a[i][j + 1]);
        			ans += Math.abs(a[i][j] - a[i][j - 1]);
        			ans += Math.abs(a[i][j] - a[i + 1][j]);
        		}
        		else {
        			ans += Math.abs(a[i][j] - a[i][j + 1]);
        			ans += Math.abs(a[i][j] - a[i + 1][j]);
        		}
        	}
        }

        System.out.println(ans);
	}

}
