import java.util.Scanner;
import java.lang.Math;

public class Encryption {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = "";
        int lenS = s.length();
        int p = (int) Math.sqrt(lenS);
        int k = p;
        
        if (k * p < lenS) {
        	k = p + 1;
        }
        
        char[][] a = new char[p + 1][k];
        int c = 0;
        int q = lenS % k;
        int tempK = k;

//        System.out.println("q: " + q);
//        System.out.println("p: " + p);
//        System.out.println("k: " + k);
//        System.out.println("lenS: " + lenS);
        
        while (c < lenS) {
        	int i = 0, j = 0;
        	while (i <= p) {
//        		System.out.println("i, j: " + i + " " + j);
//    			System.out.println("c: " + c);
        		if (c < lenS) {
//        			System.out.println("s.charAt(c): " + s.charAt(c));
            		a[i][j] = s.charAt(c);
//            		System.out.println("a[i][j], i, j: " + a[i][j] + " " + i + " " + j);
            		c++;
        		}
        		else {
        			break;
        		}
        		j++;
        		if (j == k) {
        			i++;
        			j = 0;
        		}
        		else if (i == p && q != 0) {
        			k = q;
        		}
        	}
        	break;
        }
        k = tempK;
        
        for (int y = 0; y < k; ++y) {
        	int x = 0;
        	while (x < p + 1) {
        		if ((a[x][y] >= 'a' && a[x][y] <= 'z')) {
//            		System.out.print(a[x][y] + " ");
            		ans += a[x][y];
        		}
        		x++;
//        		System.out.print(a[x][y] + " ");
        	}
        	x--;
        	if (y < k - 1) { 
            	ans += ' ';
        	}
//        	System.out.println();
        }
//        System.out.println("k: " + k);
//        System.out.println("p: " + p);
//        for (int x = 0; x < p + 1; ++x) {
//        	for (int y = 0; y < k; ++y) {
//        		System.out.print(a[x][y] + " ");
//        	}
//        	System.out.println();
//        }
        
        System.out.println(ans);
	}

}
