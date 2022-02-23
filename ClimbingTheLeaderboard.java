import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//use bubble search or faster search method

public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), firstScore = 0;
        List<Integer> scores = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
            if (i == 0) {
                firstScore = a[i];
                scores.add(firstScore);
            }
            else if (i == 1) {
                if (a[i] == firstScore) {
                    continue;
                }
                else {
                    scores.add(a[i]);
                }
            }
            else if (i >= 2 && i < n) {
                if (a[i] != a[i - 1]) {
                    scores.add(a[i]);
                }
                else {
                    continue;
                }
            }
        }
        
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; ++i) {
            b[i] = scanner.nextInt();
        }
        scanner.close();
        
        int s = scores.size(), j = 0;
        Collections.sort(scores);
        
        for (int i = 0; i < m; i++) {
        	while (j < s && b[i] >= scores.get(j)) {
        		j++;
        	}
        	res.add(s - j + 1);
        }
        
        for (int i = 0; i < res.size(); ++i) {
            System.out.println(res.get(i));
        }
        
        
    }

}
