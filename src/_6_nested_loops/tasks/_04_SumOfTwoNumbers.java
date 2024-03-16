package _6_nested_loops.tasks;

import java.util.Scanner;

public class _04_SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        // комбинация: число1; число 2
        // число 1:
        // число 2:

        // брой на всички комбинации
        int count = 0;
        for (int firstNumber = start; firstNumber <= end; firstNumber++) {
            for (int secondNumber = start; secondNumber <= end; secondNumber++) {
                // System.out.println(firstNumber + " " + secondNumber);

                // преброяваме генерираната комбинация
                count++;

                // комбинация: число1, число2
                // сума от числата в комбинацията
                int sum = firstNumber + secondNumber;
                if (sum == magicNumber) {
                    // валидна комбинация - прелратяваме цялата програма
                    System.out.printf("Combination N:%d (%d + %d = %d)",
                            count, firstNumber, secondNumber, magicNumber);

                    // с оператора break, няма да стане, защото ще излезем само от
                    // вложеният цикъл. Това става с оператора return
                    // прекратяваме цялата програма
                    return;
                }

            }
        }

        // обходили сме всички комбинации и не сме намерили валидна
        System.out.printf("%d combinations - neither equals %d", count, magicNumber);

    }

}
