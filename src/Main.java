import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String[] usernames = {"admin", "username"};
        String[] passwords = {"9876", "1234"};


        boolean isAuthenticated = false;

        while(!isAuthenticated) {

            String uNameIn = JOptionPane.showInputDialog(null, "Enter your username");
            String passIn = JOptionPane.showInputDialog(null, "Enter your password");

            for(int i = 0; i < usernames.length ;i++) {
                if (usernames[i].equals(uNameIn) && passwords[i].equals(passIn)) {
                    JOptionPane.showMessageDialog(null, "Welcome \"" + uNameIn + "\"");
                    isAuthenticated = true;
                    break;
                } else if (uNameIn == null || passIn == null) {
                    break;
                }
            } if(!isAuthenticated)
                JOptionPane.showMessageDialog(null, "Password does not match with username.");
        }

    }
}
