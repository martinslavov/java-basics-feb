package _2_conditional_statements;

import java.util.Scanner;

public class _1_ExcellentResult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 5 или по-висока. Това е много важно - 5 или по-висока.
        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5) {
            System.out.println("Excellent!");
        }
    }
}
