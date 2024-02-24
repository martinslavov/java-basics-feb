package _4_for_loop;

import java.util.Scanner;

public class _02_NumbersFromNTo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // начало: n
        // край: 1
        // промяна: -1
        for (int currentNumber = n; currentNumber >= 1; currentNumber--) {
            System.out.println(currentNumber);
        }
        
    }
}
