import java.util.Scanner;

public class TheTimeInWords {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        String m = scanner.next();
        int k = Integer.parseInt(m);
        scanner.close();
        String[] o = {"0", "one", "two", "three", "four", "five", "six", 
        				"seven", "eight", "nine", "ten", "eleven", "twelve"};
        String[] min = {"0", "one minute", "two minutes", "three minutes", "four minutes", "five minutes", "six minutes", 
						"seven minutes", "eight minutes", "nine minutes", "ten minutes", "eleven minutes", "twelve minutes",
						"thirteen minutes", "fourteen minutes", "quarter", "sixteen minutes", "seventeen minutes",
						"eighteen minutes", "nineteen minutes", "twenty minutes", "twenty one minutes", "twenty two minutes",
						"twenty three minutes", "twenty four minutes", "twenty five minutes", "twenty six minutes",
						"twenty seven minutes", "twenty eight minutes", "twenty nine minutes", "half"};
        
        if (k <= 30 && min[k].equals("0")) {
        	System.out.println(o[h] + " o' clock");
        }
        else {
            if (k <= 30) {
            	System.out.println(min[k] + " past " + o[h]);
            }
            else if (k > 30) {
            	System.out.println(min[60 - k] + " to " + o[h + 1]);
            }
        }

	}

}
