// Hello Git Test
package loan;

/**
The LoanMonthlyPayment class calculates the monthly payment needed to pay off
 * a loan. The class API is based on a purchase amount and a down payment.
 * Internally, the class calculates the amount to be financed by the loan as the
 * purchase amount less the down payment.
 *
 * @author 127.0.0.1
 */
public class LoanMonthlyPayment {


   
    private double purchaseAmount;
    private double downPayment;
    private double apr;
    private double years;
    //variables used for calculating monthly payment
    private final double periodsPerYear = 12;
    private double pr;
    private double periods;
    private double loanAmount;
        
    
    
    public LoanMonthlyPayment() {
        purchaseAmount = 0;
        downPayment = 0;
        apr = 0;
        years = 0;
        loanAmount = 0;
        periods = 0;
        pr = 0;
    }
    
    /**
     * The class constructor creates a LoanMonthlyPayment object configured to
     * calculate a loan payment. Two constructors are required, one that does
     * not accept parameters, and one that does. Where no parameters are used,
     * the “set” methods must be used to store loan parameters within the
     * resulting object. Where parameters are used, the loan parameters are
     * provided to the object through the constructor.
     *
     * @param purchaseAmount - the amount of the purchase to be made by the
     * borrower
     * @param downPayment – the down payment to be made by the borrower against
     * the purchase amount
     * @param apr – the annual percentage rate (APR) to be applied to the loan.
     * @param years - the duration of the loan in years
     */
     

     public LoanMonthlyPayment(double purchaseAmount,
            double downPayment,
            double apr, double years) {
        
        this.purchaseAmount = purchaseAmount;
        this.downPayment = downPayment;
        this.apr = apr;
        this.years = years;
        updatePeriodRate();
        updatePeriods ();
        updateLoanAmount();
    }

    
    public void setPurchaseAmount(double p) {
        this.purchaseAmount = p;
        updateLoanAmount();
    }

    public void setDownPayment(double p) {
        this.downPayment = p;
        updateLoanAmount();
    }

    public void setAPR(double p) {
        this.apr = p;
        updatePeriodRate();
    }

    public void setYears(double p) {
        this.years = p;
        updatePeriods();
    }

    /**
     * Return the purchase amount associated with this loan
     * @return the purchase amount
     */
    public double getPurchaseAmount() {
        return purchaseAmount;
    }
    
    /**
     * Return the down payment
     * @return the down payment
     */
    public double getDownPayment() {
        return downPayment;
    }
    
    /**
     * Return the Annual Return Rate
     * @return APR
     */
    public double getAPR() {
        return apr;
    }

    /**
     * Return the years associated with the loan
     * @return years
     */
    public double getYears() {
        return years;
    }

    /**
     * Return the calculation of Monthly Payment
     * @return the monthly payment
     */
    public double calcMonthlyPayment() {
        double pvifa = (1 - (1/ Math.pow(1 + pr, periods))) / pr;
        return loanAmount / pvifa;
    }
    private void updatePeriodRate() {
        pr = this.apr / (periodsPerYear * 100); 
    }
    private void updatePeriods () {
         periods = this.years * periodsPerYear;
    }
    private void updateLoanAmount () {
        loanAmount = this.purchaseAmount - this.downPayment;
    }
            
}
        
    
    
