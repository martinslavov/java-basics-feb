package _1_first_steps_in_coding;

import java.util.Scanner;

public class _4_InchesToCentimeters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());
        double result = inch * 2.54;

        System.out.println(result);

        // ще го вземем по-нататък
        // char c = scanner.next().charAt(0);

    }
}
