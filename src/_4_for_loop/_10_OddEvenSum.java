package _4_for_loop;

import java.util.Scanner;

public class _10_OddEvenSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Разликата се изчислява по абсолютна стойност
        // Ние говорихме как става това в предната лекция
        // Но нека да го видим пак
        // Нас ни интересува дали итерацията е четна или нечетна
        // Ние трябва да вземем числата за всяка четна
        // итерация и да ги съберем
        // след което да ги сравним със сумите на нечетните итерации

        int numbersSumOfEvenPositions = 0;
        int numbersSumOfOddPositions = 0;


        for (int position = 0; position < n; position++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());
            if ( position % 2 == 0) {
                numbersSumOfEvenPositions += currentNumber;
            } else {
                numbersSumOfOddPositions += currentNumber;
            }

        }

        if (numbersSumOfEvenPositions == numbersSumOfOddPositions ){
            System.out.println("Yes");
            System.out.println("Sum = " + numbersSumOfEvenPositions);
        }  else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(numbersSumOfEvenPositions - numbersSumOfOddPositions));
        }

    }
}
