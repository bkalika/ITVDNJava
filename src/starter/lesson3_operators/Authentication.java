package starter.lesson3_operators;

import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "p@ssword";

        Scanner sc = new Scanner(System.in);

        System.out.println("Input your login: ");

        String userLogin = sc.next();

        if (login.equals(userLogin)){
            System.out.println("Input your password: ");

            String userPassword = sc.next();

            if (password.equals(userPassword)){
                System.out.println(userLogin + " successfully authentication.");
            } else{
                System.out.println("Password is wrong.");
            }
        } else{
            System.out.println("User with login " + userLogin + " not found.");
        }

    }
}
