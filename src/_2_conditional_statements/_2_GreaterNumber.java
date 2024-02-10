package _2_conditional_statements;

import java.util.Scanner;

public class _2_GreaterNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());


        // ako number1 е по-големя от number2, аз искам да го принтирам
        // защо, защото знам че е по-голямо
        // във всички останали случай аз искам да принтирам number2, защото
        // знам че то ще е по-голямо

        // Нека обясня по-подробно, ако получа true ...
        if (number1 > number2){
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }


    }
}
