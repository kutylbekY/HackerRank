import java.util.Scanner;
import java.lang.Math;

public class QueensAttackII {
	
	public static void main(String[] args) {	
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
//        String[][] board = new String[n][n];
        int[][] obs = new int[8][2];
        int x = scanner.nextInt(), y = scanner.nextInt();
        int i, j, temp = 0;
        boolean isObs = false;
        String pos;
        long res = 0;
        int[] a = new int[8];

        for (int p = 0; p < k; ++p) {
            i = scanner.nextInt();
            j = scanner.nextInt();
			pos = location(x, y, i, j);
			
			if (pos.equals("xxx")) {
				continue;
			}
			else if (pos.equals("r")) {
				if (a[0] != 1) {
					obs[0][0] = i;
					obs[0][1] = j;
				}
				else {
					if (j <= obs[0][1]) {
						obs[0][1] = j;
					}
				}
				a[0] = 1;
				isObs = true;
			}
			else if (pos.equals("u")) {
				if (a[1] != 1) {
					obs[1][0] = i;
					obs[1][1] = j;
				}
				else {
					if (i >= obs[1][0]) {
						obs[1][0] = i;
					}
				}
				a[1] = 1;
				isObs = true;
			}
			else if (pos.equals("l")) {
				if (a[2] != 1) {
					obs[2][0] = i;
					obs[2][1] = j;
				}
				else {
					if (j >= obs[2][1]) {
						obs[2][1] = j;
					}
				}
				a[2] = 1;
				isObs = true;
			}
			else if (pos.equals("d")) {
				if (a[3] != 1) {
					obs[3][0] = i;
					obs[3][1] = j;
				}
				else {
					if (i <= obs[3][0]) {
						obs[3][0] = i;
					}
				}
				a[3] = 1;
				isObs = true;
			}
			else if (pos.equals("ru")) {
				if (a[4] != 1) {
					obs[4][0] = i;
					obs[4][1] = j;
				}
				else {
					if (j <= obs[4][1] && i >= obs[4][0]) {
						obs[4][0] = i;
						obs[4][1] = j;
					}
				}
				a[4] = 1;
				isObs = true;
			}
			else if (pos.equals("lu")) {
				if (a[5] != 1) {
					obs[5][0] = i;
					obs[5][1] = j;
				}
				else {
					if (j >= obs[5][1] && i >= obs[5][0]) {
						obs[5][0] = i;
						obs[5][1] = j;
					}
				}
				a[5] = 1;
				isObs = true;
			}
			else if (pos.equals("rd")) {
				if (a[6] != 1) {
					obs[6][0] = i;
					obs[6][1] = j;
				}
				else {
					if (j <= obs[6][1] && i <= obs[6][0]) {
						obs[6][0] = i;
						obs[6][1] = j;
					}
				}
				a[6] = 1;
				isObs = true;
			}
			else if (pos.equals("ld")) {
				if (a[7] != 1) {
					obs[7][0] = i;
					obs[7][1] = j;
				}
				else {
					if (j >= obs[7][1] && i <= obs[7][0]) {
						obs[7][0] = i;
						obs[7][1] = j;
					}
				}
				a[7] = 1;
				isObs = true;
			}
        }
        scanner.close();
//        System.out.println();
        
        if (isObs == false) {
            res += queen(x, y, n);
//            System.out.println("queen: " + queen(x, y, n));
        }
        else {
        	for (int p = 0; p < 8; ++p) {
//        		System.out.println("x,y obs: " + obs[p][0] + " " + obs[p][1]);
//        		System.out.println("a: " + a[p]);
//        		System.out.println("p: " + p);
//        		System.out.println();
        		temp = 0;
        		if (a[p] != 1) {
        			if (p == 0) {
        				res += n - y;
//        				System.out.println("r: " + (n-y));
        			}
        			else if (p == 1) {
        				res += x - 1;
//        				System.out.println("u: " + (x-1));
        			}
        			else if (p == 2) {
        				res += y - 1;
//        				System.out.println("l: " + (y-1));
        			}
        			else if (p == 3) {
        				res += n - x;
//        				System.out.println("d: " + (n-x));
        			}
        			else if (p == 4) {
        				if (n - y <= x - 1) {
            				temp = n - y;
        				}
        				else {
            				temp= x - 1;
        				}
        				res += temp;
//        				System.out.println("ru: " + temp);
        			}
        			else if (p == 5) {
        				if (x - 1 <= y - 1) {
        					temp= x - 1;
        				}
        				else {
        					temp= y - 1;
        				}
        				res += temp;
//        				System.out.println("lu: " + temp);
        			}
        			else if (p == 6 ) {
        				if (n - x <= n - y) {
        					temp= n - x;
        				}
        				else {
        					temp= n - y;
        				}
        				res += temp;
//        				System.out.println("rd: " + temp);
        			}
        			else if (p == 7) {
        				if (n - x <= y - 1) {
        					temp= n - x;
        				}
        				else {
        					temp= y - 1;
        				}
        				res += temp;
//        				System.out.println("ld: " + temp);
        			}
        		}
        		else {
        			if (p == 0) {
        				res += obs[p][1] - y - 1;
//        				System.out.println("r: " + (obs[p][1] - y - 1));
        			}
        			else if (p == 1) {
        				res += x - obs[p][0] - 1;
//        				System.out.println("u: " + (x - obs[p][0] - 1));
        			}
        			else if (p == 2) {
        				res += y -  obs[p][1] - 1;
//        				System.out.println("l: " + (y -  obs[p][1] - 1));
        			}
        			else if (p == 3) {
        				res += obs[p][0] - x - 1;
//        				System.out.println("d: " + (obs[p][0] - x - 1));
        			}
        			else if (p == 4) {
        				res += obs[p][1] - y - 1;
//        				System.out.println("ru: " + (obs[p][1] - y - 1));
        			}
        			else if (p == 5) {
        				res += y - obs[p][1] - 1;
//        				System.out.println("lu: " + (y - obs[p][1] - 1));
        			}
        			else if (p == 6 ) {
        				res += obs[p][0] - x - 1;
//        				System.out.println("rd: " + (obs[p][0] - x - 1));
        			}
        			else if (p == 7) {
        				res += obs[p][0] - x - 1;
//        				System.out.println("ld: " + (obs[p][0] - x - 1));
        			}
        		}
        	}
        }
        System.out.println(res);
	}
	
	public static int queen (int x, int y, int n) {
		int line = 2 * n - 2;
		int dia = 2 * n - 2 - Math.abs(x - y) - Math.abs(x + y - n - 1);
		return (line + dia);
	}
	
	public static String location (int x, int y, int i, int j) {
		if (j < y && i == x) {
			return "l";
		}
		else if (j > y && i == x) {
			return "r";
		}
		else if (i < x && j == y) {
			return "u";
		}
		else if (i > x && j == y) {
			return "d";
		}
		else if (Math.abs(x - i) == Math.abs(y - j)) {
			if (i < x && j > y) {
				return "ru";
			}
			else if (i < x && j < y) {
				return "lu";
			}
			else if (i > x && j > y) {
				return "rd";
			}
			else if (i > x && j < y) {
				return "ld";
			}
		}
		return "xxx";
	}

	
	
}
