import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;

public class FraudulentActivityNotifications {
	
	static double find_mid (int[] cnt, int mid, int d) {
		double st = 0, b = 0, end = 0;
		
		while (b < mid) {
			b += cnt[(int) st];
			st++;
		}
		
		end = st;
		st--;
		
		if (b > mid || d % 2 == 1) {
			return st;
		}
		else {
			while (cnt[(int)end] == 0) {
				end++;
			}
			return ((end + st) / 2);
		}
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), d = scanner.nextInt();
        int ans = 0, left = 0, mid = 0, end = d;
        int[] a = new int[n + 2];
        int[] cnt = new int[201];
        
        for (int i = 0; i < n; ++i) {
        	a[i] = scanner.nextInt();
        	if (i < d) {
        		cnt[a[i]]++;
        	}
        }
        scanner.close();
        
        if (d % 2 == 0) {
        	mid = d / 2;
        }
        else {
        	mid = (d / 2) + 1;
        }
        
        while (end < n) {
        	double median = find_mid(cnt, mid, d);
        	if (a[end] >= median * 2) {
        		ans++;
        	}
        	cnt[a[left]]--;
        	cnt[a[end]]++;
        	left++;
        	end++;
        }
        
        System.out.println(ans);
        
	}

}
