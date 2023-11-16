package Model;

public class Spent implements Transaction{
    private String description;
    private double amount;

    public Spent(String name, double amount) {
        this.description = name;
        this.amount = amount;
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
