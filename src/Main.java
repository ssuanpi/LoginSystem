import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String username = "username";
        String password = "1234";

        boolean isAuthenticated = false;

        while(!isAuthenticated) {

            String uNameIn = JOptionPane.showInputDialog(null, "Enter your username");
            String passIn = JOptionPane.showInputDialog(null, "Enter your password");

            if (username.equals(uNameIn) && password.equals(passIn)) {
                JOptionPane.showMessageDialog(null, "Welcome \"" + uNameIn + "\"");
                isAuthenticated = true;
            } else if (uNameIn == null || passIn == null) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Password does not match with username.");
            }
        }
    }
}
