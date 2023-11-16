package Model;

public class Debt {
    private double amount;
    private String description;

    public Debt(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
