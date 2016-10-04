/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanTest;

import loan.LoanMonthlyPayment;

/**
 *
 * @author Roberto
 */
public class LoanTest {
    public static void main(String[] args) {
        System.out.println("Test Case 1");
        LoanMonthlyPayment loan = new LoanMonthlyPayment(350000, 0, 10, 15);
        displayInputs(loan);
        System.out.println("Montly payment: " + loan.calcMonthlyPayment());

        System.out.println("\nTest Case 2");
        loan.setDownPayment(50000);
        displayInputs(loan);
        System.out.println("Montly payment: " + loan.calcMonthlyPayment());

        System.out.println("\nTest Case 3");
        loan.setDownPayment(0);
        loan.setAPR(5);
        displayInputs(loan);
        System.out.println("Montly payment: " + loan.calcMonthlyPayment());

        System.out.println("\nTest Case 4");
        loan.setDownPayment(50000);
        displayInputs(loan);
        System.out.println("Montly payment: " + loan.calcMonthlyPayment());

    }

    private static void displayInputs(LoanMonthlyPayment loan) {
        System.out.println("Purchase Amount: " + loan.getPurchaseAmount());
        System.out.println("Down Payment: " + loan.getDownPayment());
        System.out.println("APR (%): " + loan.getAPR());
        System.out.println("Duration (years): " + loan.getYears());
    }
}


