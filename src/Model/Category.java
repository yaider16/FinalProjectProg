package Model;

public class Category implements Transaction{
    private String description;
    private double amount;

    @Override
    public double obtainAmount() {
        return this.amount;
    }

    @Override
    public String obtainDescription() {
        return this.description;
    }

    public Category(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }
}
