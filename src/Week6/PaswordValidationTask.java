package Week6;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PaswordValidationTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your password");
        String pass = s.nextLine();

        if (isValidPassword(pass)) {
            System.out.println("Pass is valid");
        } else {
            System.out.println("Pass is Not valid");
        }
    }

    public static boolean
    isValidPassword(String password) {

        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{6,20}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    }
}

