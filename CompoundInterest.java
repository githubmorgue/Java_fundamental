/*
 * This program shows how to store tabular data in a 2D array
 */


public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set interest rates to 10 . . . 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];

        // set initial balance to 10000
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 10000; // Initial balance for the first year
        }

        for (int i = 0; i < balances.length; i++)
            for (int j = 0; j < balances[j].length; j++)
            {
                // get last year's balances from previous row
                double oldBalance = balances[i-1][j];

                // compute interest
                double interest = oldBalance * interestRate[j];

                // compute this year's balances
                balances[i][j] = oldBalance + interest;
            }

            // print one row of interest rates
            for (int j = 0; j < interestRate.length; j++)
                System.out.printf("%9.0f%%", 100*interestRate[j]);

            System.out.println();

            // print balance table
            for (double[] row : balances)
            {
                // print balance table
                for (double b : row)
                    System.out.printf("%10.2f", b);

                System.out.println();
            }
    }
}