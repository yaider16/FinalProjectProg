package View;

import javax.swing.*;

public class View {
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    public String askInfo(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public String askVariousInfo(String[] options, String message) {
        return (String) JOptionPane.showInputDialog(null, message, "Input", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }

    public boolean askYesOrNo(String message) {
        int option = JOptionPane.showConfirmDialog(null, message, "Input", JOptionPane.YES_NO_OPTION);
        return option == JOptionPane.YES_OPTION;
    }
}