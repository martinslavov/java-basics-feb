package _4_for_loop;

import java.util.Scanner;

public class _03_Numbers1toNWithStep3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // начало: 1
        // край: n
        // промяна: +3
        for (int number = 1; number <= n; number+=3) {
            System.out.println(number);
        }

    }

}
