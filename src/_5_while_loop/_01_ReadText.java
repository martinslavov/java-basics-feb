package _5_while_loop;

import java.util.Scanner;

public class _01_ReadText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // повтаряме: въвеждаме входни данни -> отпечатваме
        // стоп: входни данни == "Stop"
        // продължаваме: входни данни != "Stop"

        while (!input.equals("Stop")){
            System.out.println(input);
            input = scanner.nextLine();
        }

    }

}
