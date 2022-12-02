package entities;

public class Individual extends TaxPayer{

    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double healthExpenditures(){
        return 0.5*healthExpenditures;

    }

    @Override
    public double tax() {
        if(this.getAnnualIncome() < 20000.00){
            return this.getAnnualIncome()*0.15 - healthExpenditures();
        } else {
            return this.getAnnualIncome()*0.25 - healthExpenditures();
        }
    }

}
