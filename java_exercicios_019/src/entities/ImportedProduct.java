package entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return super.getPrice() + this.customsFee;
    }

    @Override
    public String priceTag() {
        StringBuilder sb =  new StringBuilder();
        sb.append(super.getName());
        sb.append(" $ ");
        sb.append(String.format("%.2f", this.totalPrice()));
        sb.append(" (Customs fee: $ ");
        sb.append(String.format("%.2f", this.customsFee));
        sb.append(")");
        return sb.toString();
    }
}
