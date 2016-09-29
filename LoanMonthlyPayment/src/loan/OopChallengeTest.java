/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loan;
import Loan.LoanMonthlyPayment;
import java.text.NumberFormat;
/**
 * The class you develop shall be called “LoanMonthlyPayment”. 2. The class
 * shall be added to the “loan” package. Loan Payment functions: The
 * LoanMonthlyPayment class shall calculate the monthly payment required to pay
 * off a loan given the amount purchased, down payment, interest rate (APR), and
 * loan duration.
 *
 * @author Sowathana Dennie Hem
 */
public class OopChallengeTest {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        LoanMonthlyPayment Loan = new LoanMonthlyPayment (350000, 0, 10, 15);
        System.out.println(" LoanMonthlyPayment Plan\n");
        System.out.println(" Test Case 1");
        System.out.println(" Purchase Amount : " + currency.format(Loan.getPurchaseAmount()));
        System.out.println(" Down Payment : " + currency.format(Loan.getDownPayment()));
        System.out.println(" APR : " + Loan.getAPR() +"%");
        System.out.println(" Loan duration (years) : " + Loan.getYears());
        System.out.println(" Monthly Payment: " + currency.format(Loan.calcMonthlyPayment()));
        
        System.out.println("\nTest Case 2");
        Loan.setDownPayment(50000);
        System.out.println(" Purchase Amount : " + currency.format(Loan.getPurchaseAmount()));
        System.out.println(" Down Payment : " + currency.format(Loan.getDownPayment()));
        System.out.println(" APR : " + Loan.getAPR() +"%");
        System.out.println(" Loan duration (years) : " + Loan.getYears());
        System.out.println(" Monthly Payment: " + currency.format(Loan.calcMonthlyPayment()));
        
        System.out.println("\nTest Case 3");
        Loan.setAPR(5);
        Loan.setDownPayment(0);
        System.out.println(" Purchase Amount : " + currency.format(Loan.getPurchaseAmount()));
        System.out.println(" Down Payment : " + currency.format(Loan.getDownPayment()));
        System.out.println(" APR : " + Loan.getAPR() +"%");
        System.out.println(" Loan duration (years) : " + Loan.getYears());
        System.out.println(" Monthly Payment: " + currency.format(Loan.calcMonthlyPayment()));
        
        System.out.println("\nTest Case 4");
        Loan.setDownPayment(50000);
        System.out.println(" Purchase Amount : " + currency.format(Loan.getPurchaseAmount()));
        System.out.println(" Down Payment : " + currency.format(Loan.getDownPayment()));
        System.out.println(" APR : " + Loan.getAPR() +"%");
        System.out.println(" Loan duration (years) : " + Loan.getYears());
        System.out.println(" Monthly Payment: " + currency.format(Loan.calcMonthlyPayment()));
    }
    
}