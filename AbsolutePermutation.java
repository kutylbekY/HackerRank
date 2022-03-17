import java.util.Scanner;
import java.lang.Math;

public class AbsolutePermutation {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int p = 0; p < t; ++p) {
            int n = scanner.nextInt(), k = scanner.nextInt();
        	int[] a = new int[n + 2];
        	boolean ans = false;
        	int temp = 0, j = 1, l = k * 2;

        	if (k == 0) {
                for (int i = 1; i <= n; ++i) {
                    a[i] = i;
                }
                ans = true;
            }
        	else {
	    		while (l > j) {
	    			if (l > n) {
	    				break;
	    			}
    				if (l == n) {
    					temp = 1;
    				}
    				a[j] = j + k;
    				a[l] = l - k;
	    			j++;
	    			l--;
	    			if (temp == 0 && l <= j) {
	    				j += k;
	    				l += k * 3;
	    			}
	    		}
	    		ans = true;
	        	
	        	for (int i = 1; i <= n; ++i) {
        			if (a[i] != 0 && a[i] <= n && Math.abs(a[i] - i) == k) {
        				continue;
        			}
        			else {
        				ans = false;
        				break;
        			}
	        	}
        	}
        	
        	if (ans == false) {
        		System.out.println("-1");
        	}
        	else {
            	for (int i = 1; i <= n; ++i) {
            		System.out.print(a[i] + " ");
            	}
            	System.out.println();
        	}
        	
        }
        
        scanner.close();
        
	}

}
