package gov.services.tax;

public class TaxService {
    public void collectTax(){
        System.out.println("Calculating tax...");
        System.out.println("Tax collected successfully");
    }

    public String getTaxType(){
        return "Income Tax";
    }
}
