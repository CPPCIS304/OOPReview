package Loan.test;

import Loan.LoanMonthlyPayment;
import java.text.NumberFormat;


/**
 * Code of Loan.test is for Loan.LoanMonthlyPayment Class
 * @author 127.0.0.1
 */
public class LoanTest {
    /**
     * LoanMonthlyPayment class test code.
     *
     * @param args no command line arguments used
     */
    public static void main(String[] args) {
         NumberFormat currency = NumberFormat.getCurrencyInstance();
         
        System.out.println("Test Case 1");
        LoanMonthlyPayment loan = new LoanMonthlyPayment(350000, 0, 10, 15);
        displayInputs(loan);
        System.out.println("Montly payment: " + currency.format(loan.calcMonthlyPayment()));

        System.out.println("\nTest Case 2");
        loan.setDownPayment(50000);
        displayInputs(loan);
        System.out.println("Montly payment: " +  currency.format(loan.calcMonthlyPayment()));

        System.out.println("\nTest Case 3");
        loan.setDownPayment(0);
        loan.setAPR(5);
        displayInputs(loan);
        System.out.println("Montly payment: " +  currency.format(loan.calcMonthlyPayment()));

        System.out.println("\nTest Case 4");
        loan.setDownPayment(50000);
        displayInputs(loan);
        System.out.println("Montly payment: " +  currency.format(loan.calcMonthlyPayment()));
    }

    private static void displayInputs(LoanMonthlyPayment loan) {
        System.out.println("Purchase Amount: " + loan.getPurchaseAmount());
        System.out.println("Down Payment: " + loan.getDownPayment());
        System.out.println("APR (%): " + loan.getAPR());
        System.out.println("Duration (years): " + loan.getYears());
    }
}


