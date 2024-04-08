import java.math.*;
import java.util.*;


/*
 * This program uses big numbers to compute the odds of wining the grand prize in a lottery.
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the hightest number you can draw? ");
        BigInteger n = in.nextBigInteger();

        /*
         * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        BigInteger lotteryOdds = BigInteger.ONE;

        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds
                .multiply(n.subtract(BigInteger.valueOf(i-1)))
                .divide(BigInteger.valueOf(i));

        System.out.printf("Your odds are 1 in %s. Good luck!%n", lotteryOdds);
    }
}
