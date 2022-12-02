package entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if(numberOfEmployees > 10){
            return this.getAnnualIncome()*0.14;
        } else {
            return this.getAnnualIncome()*0.16;
        }
    }

}
