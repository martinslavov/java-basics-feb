package _5_while_loop;

import java.util.Scanner;

public class _04_Sequence2k1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // 1 до n, който се променят * 2 + 1

        // повтаряме: отпечатваме числа
        // начало: 1
        // стоп: n
        // продължаваме:  * 2 + 1

        for (int number = 0; number <= n; number = number * 2 + 1) {
            System.out.println(number);
        }

        // повтаряме: отпечатваме числото -> отиваме към следващото
        // стоп: number > n
        // продължаваме: number <= n

        int numberWhile = 1;
        while (numberWhile <= n) {
            System.out.println(numberWhile);
            numberWhile = numberWhile * 2 + 1;
        }

    }

}
