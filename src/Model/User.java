package Model;

import java.util.ArrayList;

public class User {
    private String name;
    private String lastName;
    private double balance;
    private ArrayList<Transaction> transactions;
    private ArrayList<Category> budgets;
    private ArrayList<Save> saves;
    private ArrayList<Debt> debts;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.transactions = new ArrayList<Transaction>();
    }
    public void newTransaction(Transaction transaction){
        this.transactions.add(transaction);
        if (transaction instanceof Spent){
            this.balance -= transaction.obtainAmount();
        }else{
            this.balance += transaction.obtainAmount();
        }
    }
    public ArrayList<Transaction> transactionResume(){
        return this.transactions;
    }
    public void addBudget(Category category){
        this.budgets.add(category);
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }
}
