package Presenter;
import Model.*;
import View.View;
public class Presenter {
    private View view = new View();
    private User user;
    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.  menu();
    }
    public void menu(){
        String[] options = {"Registrar ingreso","Registrar salida", "Ver resumen de transacciones", "Agregar ahorro", "Ver ahorro","Agregar deuda","Ver deudas", "ver dinero actual","Salir"};
        user = new User(view.askInfo("Ingresa tu nombre"), view.askInfo("Ingresa tu apellido"));
        do {
            String option = view.askVariousInfo(options, "Hola "+ user.getName() + " ¿Que deseas hacer?");
            switch (option){
                case "Registrar ingreso"-> registerIncome();
                case "Registrar salida"-> registerOutcome();
                case "Ver resumen de transacciones"-> viewTransactionResume();
                case "Agregar ahorro"-> addSave();
                case "Ver ahorro"-> viewSave();
                case "Agregar deuda"-> addDebt();
                case "Ver deudas"-> viewDebt();
                case "ver dinero actual"-> viewBalance();
                default -> System.exit(0);
            }
        }while (true);
    }

    private void viewBalance() {
        view.showMessage("Tu balance actual es: " + user.getBalance());
    }

    private void viewDebt() {
    }

    private void addDebt() {
    }

    private void viewSave() {
    }

    private void addSave() {
    }

    private void viewTransactionResume() {
        String resume = "";
        for (Transaction transaction: user.transactionResume()){
            resume += transaction.obtainDescription() + " " + transaction.obtainAmount()+" COP" + "\n";
        }
        if(resume.equals("")){
            view.showMessage("No tienes transacciones registradas");
            return;
        }else{
            view.showMessage(resume);
        }
    }

    private void registerOutcome() {
        String description = view.askInfo("Ingresa la descripcion");
        double amount = Double.parseDouble(view.askInfo("Ingresa el monto"));

        if (amount <= 0){
            view.showMessage("El monto debe ser mayor a 0");
            return;
        }
        if(user.getBalance() < amount){
            view.showMessage("No tienes suficiente dinero para hacer esto");
            return;
        }
        user.newTransaction(new Spent(description,amount));
        view.showMessage("Transaccion registrada con exito");
    }

    private void registerIncome() {
        String description = view.askInfo("Ingresa la descripcion");
        double amount = Double.parseDouble(view.askInfo("Ingresa el monto"));
        if (amount <= 0){
            view.showMessage("El monto debe ser mayor a 0");
            return;
        }
        user.newTransaction(new Income(amount,description));
        view.showMessage("Transaccion registrada con exito");
    }
}
