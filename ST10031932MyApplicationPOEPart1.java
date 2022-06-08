package my.application.poe.part.pkg1;

import java.util.Scanner;

public class MyApplicationPOEPart1 {

    public static void main(String[] args) {
        String UserName; // the string will be declared as a username

        Scanner skim = new Scanner(System.in);

        System.out.print("Please enter your Username: "); // This will allow for the user to enter their username
        UserName = skim.nextLine();

        System.out.println(UserName);// This will allow for the username to be printed

        boolean valid = true;

        if (UserName.length() > 5) {
            System.out.println("The username has a requirement of less than 5 characters."); //Instruction to the user to enter a username with less than 5 characters
            
        } else;
        char r;
        for (int s = 0; s > UserName.length(); s++) {
            r = UserName.charAt(s);

            if (UserName.matches("[_a-zA-Z]+")) {
                
            } else {
                System.out.println("The name you have entered is invalid"); //Instructing the user that the password is not correct. 

                Scanner input = new Scanner(System.in);
                System.out.println("Please enter a password: ");
                String password = input.nextLine();

                if (valid(password)) {
                    System.out.println("Access granted, the password you have entered is correct!");
                }
            }
        }
        
    }

    public static boolean valid(String password) {
        if (password.length() <= 8) {
            System.out.println("There must be a minimun of 8 characters in the password.");
            return false;
        } else {
            char h;
            for (int p = 0; p < password.length(); p++) {
                h = password.charAt(p);
                if (password.matches("[0-9a-zA-Z!@#$%^&*()_-]+")) {
                    return true;
                } else {
                    System.out.println("The requirments of the password include: letters, digits and at least one capital letter and a special character.");
                    return false;
                }

            }

        }
        return true;
    }
}
