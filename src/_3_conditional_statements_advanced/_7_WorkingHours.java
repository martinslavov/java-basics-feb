package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _7_WorkingHours {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        // отворен: час е [10:18] и ден е [Monday - Saturday] - open
        // затворен: час < 10 или час > 18 или е Sunday - closed

        if ( hour < 10 || hour > 18 || dayOfWeek.equals("Sunday")) {
            System.out.println("closed");
        } else {
            System.out.println("open");
        }

    }
}
