package _5_while_loop;

import java.util.Scanner;

public class _02_Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Това са ми данните за потребителският вход
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        // повтаряме: въвеждаме парола
        // стоп: въведена парола == password
        // продължаваме: въведена парола != password

        String enteredPassword = scanner.nextLine(); // Въведена парола
        while (!enteredPassword.equals(password)) {
            enteredPassword = scanner.nextLine();
        }

        // въведена парола == password
        System.out.println("Welcome " + username + "!");

    }

}
