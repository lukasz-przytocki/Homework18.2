public class TaxCalculator {


    private double lowerTax(double annualIncome) {
        double taxToPay = (annualIncome * 0.18) - 556.02;
        if (taxToPay < 0) {
            return 0;
        } else {
            return taxToPay;
        }
    }

    private double biggerTax(double annualIncome) {
        double taxToPay = (annualIncome - 85528) * 0.32;
        return 14839.02 + taxToPay;
    }

    public double calculate(double annualIncome) {
        if (annualIncome <= 85528) {
            return lowerTax(annualIncome);
        } else {
            return biggerTax(annualIncome);
        }
    }
}
