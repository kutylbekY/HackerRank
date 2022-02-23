import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger res = new BigInteger(String.valueOf(1));   
        
        for (int i = 1; i <= n; ++i) {
        	res = res.multiply(new BigInteger(String.valueOf(i)));
        }

        System.out.println(res);
	}

}
