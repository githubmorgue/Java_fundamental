import java.util.*;

/**
 * This program demonstrates a <code>for</code> loop.
 */

public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the hightest number you can draw? ");
        int n = in.nextInt();

        /*
         * compute binomial coefficient n*(n-1)*(n-2)*……*(n-k+1)/(k*……*3*2*1)
         */

         int lotteryodds = 1;
         for (int i = 1; i <= k; i++)
            lotteryodds =lotteryodds * (n-i+1) / i;
        System.out.println("Your odds are 1 in " + lotteryodds + ". Good luck! ");
    }
}
