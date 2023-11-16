package Model;

public class Income implements Transaction {
    private double amount;
    private String description;

    public Income(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }


    @Override
    public double obtainAmount() {
        return this.amount;
    }

    @Override
    public String obtainDescription() {
        return this.description;
    }
}
