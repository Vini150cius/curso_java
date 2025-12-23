package entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double anualTax;
        if (this.numberOfEmployees > 10) {
            anualTax = 0.14;
        } else {
            anualTax = 0.16;
        }

        return super.getAnualIncome() * anualTax;
    }
}
