package econ.ecommerce.Aplication;

import java.util.Scanner;

public class Ecom {
    public Ecom() {
    }

    public void run() {
        String menu;
        Scanner input = new Scanner(System.in);
        menu a = new menu();
        while (true) {
            a.mainMenu();
            menu = input.next();
            switch (menu) {
                case "1":
                    if (!a.verifiedLogin()) {
                        System.out.println("Login Failed");
                    } else {
                        System.out.println("Successful Login");
                    }
                    break;
                case "2":
                    System.out.println("Buyer");
                    break;
                case "3":
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input!!");
                    break;
            }
        }
    }
}
