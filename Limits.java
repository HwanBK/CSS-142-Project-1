
/**
 * Finds the limit of loan payments in regards to number of payments.
 * @CSC 142 - Project 1 Extra Credit
 * @Hwansu Kim (Billy)
 * @01/10/22
 */
public class Limits {
    public static void main(String[] args) {
        System.out.print('\u000c');
        double loanAmount = 10000.00;
        double totalPayment = 0.00;
        System.out.printf("%-13s", "# Pmts");
        System.out.println("Total Paid");
        for (int numOfPayments = 1; numOfPayments <= Math.pow(10, 9); numOfPayments = numOfPayments * 10) {
            double paymentAmount = ((0.03 / numOfPayments) * loanAmount) / (1.0 - Math.pow((1.0 + (0.03 / numOfPayments)), -numOfPayments));
            totalPayment = Math.round(paymentAmount * numOfPayments * 100.00) / 100.00;
            System.out.printf("%-10d", numOfPayments);
            System.out.println("   " + totalPayment);
        }
    }
}
