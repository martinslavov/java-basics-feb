package _2_conditional_statements;

import java.util.Scanner;

public class _3_EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());


        // Сега, кой е алгоритъма, който ние ще използваме много, много пъти за да разберем
        // дали едно число е четно или не четно
        // Ами директно започвам да пита.
        // Нека през това време да си създам една проверека, и ще изчакам да видим
        // какво ще ми отговорите в слайдо
        // това е така наре ченто модулно деление
        // аз го обясних в предната лекция
        // "вадя, един бял лист и им го разписвам"
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // 4 % 2 = 0 - остатък
        // 3 2% 2 = 1 - остатък
        // защото 2 се съдържа точно веднъж в 3
        // и 3 -2 = 1, остатък 1
        // 5 % 2 = 1 1, остатък 1


    }
}
