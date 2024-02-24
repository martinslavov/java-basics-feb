package _4_for_loop;

import java.util.Scanner;

public class _08_NumberSequence {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Така ние имаме ли променлива която да ми съдържа макс
        // и мин number, ами няма и ние трявба да си ги създадем
        // И тук идва тънкият момент, като наистина ви моля да
        // се опитате да ме разберете. Слушайте ме добре и се
        // опитайте да ме разберете, защото това е такава
        // техника която ние ще използваме за бъдеще

//        int minNumber = 0; // Integer.MIX_VALUE
//        int maxNumber = 0; // Integer.MAX_VALUE

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;


        // Да обясня защо 0-та в случая не е толкова добър вариант
        // Да обясня и за отицателните числа. Те не са ни казали
        // че ще ни подават отрицателни числа, но ние като програмнисти
        // трябва да предивидим всички корнър кейсове
        // ПРИМЕР: Подават се от конзолата 3 числа
        // 3 - показва колко числа ще получим
        // -2, -4, -10
        // Примерно ако задам -15, вместо 0, ще върши ли работа?
        // Да за този случай ще върши, но за някой друг няма
        // Това което трябва да напишем е Integer.MIX_VALUE,
        // Защо Integer.MIX_VALUE, защото аз искам да задам
        // май-малката интегер стойност


        // Да обясня за шорткъта за генерираме на for цикъл
        // Да обясня как всичком се генерира за нас
        // "Абе аз преди малко като ви казах, че програмистите,
        // сме малко мързеливи хора, не ви излъгах :D"
        for (int i = 1; i <= n ; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if ( currentNumber > maxNumber){
                maxNumber = currentNumber;
            }

            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }

        }

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);


    }

}
