import java.util.Scanner;

public class DayOfTheProgrammer {
	static int day = 31 + 31 + 30 + 31 + 30 + 31 + 31; 
	static final int DP = 256;
	static int date;

	static void Julian(int year) {
		boolean l = leap(year, "j");
		if (l) {
			day += 29;
			date = DP - day;
			System.out.println(date + ".09." + year);
		}
		else {
			day += 28;
			date = DP - day;
			System.out.println(date + ".09." + year);
		}
		
	}
	static void Gregorian(int year) {
		boolean l = leap(year, "g");
		if (l) {
			day += 29;
			date = DP - day;
			System.out.println(date + ".09." + year);
		}
		else {
			day += 28;
			date = DP - day;
			System.out.println(date + ".09." + year);
		}
	}
	
	static boolean leap(int year, String s) {
		if (s == "j") {
			if (year % 4 == 0) { 
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) { 
				return true;
			}
			else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		scanner.close();
		
		if (year <= 1917) {
			Julian(year);
		}
		else if (year >= 1919) {
			Gregorian(year);
		}
		else {
			day += 15;
			date = DP - day;
			System.out.println(date + ".09.1918");
		}
	}
}

