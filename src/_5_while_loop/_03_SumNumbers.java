package _5_while_loop;

import java.util.Scanner;

public class _03_SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int targetNumber = Integer.parseInt(scanner.nextLine());

        // повтаряме: въвеждаме число + сумата
        // стоп: сума >= targetNumber
        // продължаваме: сума < targetNumber

        int sum = 0; // сума на въведените числа
        while (sum < targetNumber) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }

        System.out.println(sum);

    }

}
