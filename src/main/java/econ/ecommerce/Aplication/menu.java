package econ.ecommerce.Aplication;

import java.util.Scanner;

public class menu {
    private Scanner input;

    menu() {
        input = new Scanner(System.in);
    }

    public void mainMenu() {
        System.out.println("1. Seller");
        System.out.println("2. Buyer");
        System.out.println("3. Exit");
        System.out.print("Login as a : ");
    }

    public void loginMenuSeller() {
        while (!verifiedLogin()) {

        }
    }

    public boolean verifiedLogin() {
        System.out.print("Username : ");
        String uname = input.next();
        System.out.print("Password : ");
        int pass = input.nextInt();
        return true;
    }

}
