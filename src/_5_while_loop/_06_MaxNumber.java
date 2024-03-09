package _5_while_loop;

import java.util.Scanner;

public class _06_MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // повтаряме: въвеждаме входни данни ("Stop" или числа
        // под формата на текст)
        // стоп: входни данни == "Stop"
        // продължаваме: входни данни != "Stop"

        int max = Integer.MIN_VALUE;

        String input  = scanner.nextLine();
        while (!input.equals("Stop")) {

            // парсване -> операция, която преобразува текст към число
            int number = Integer.parseInt(input); // 80

            // правя проверка дали е макс
            if (number > max){
                max = number;
            }

            input = scanner.nextLine();
        }

        System.out.println(max);


    }

}
