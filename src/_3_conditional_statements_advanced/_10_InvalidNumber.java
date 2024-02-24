package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _10_InvalidNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        // валидно: диапазона [100...200] или е 0 -> не печатаме нищо
        // невалидно -> печатаме invalid

        // Тук ще сложа едни скоби, защото искам първо да ми се изчисли
        // дали числото е в този диапазон и после да се провери дали е равно на 0
        if ((number >= 100 && number <= 200) || number == 0 ){
            //валидно чиско
        } else {
            // невалидно
            System.out.println("invalid");
        }
        // Това е единият начин на решаване на тази задача
        // дебъгвам и показвам


//        === - това е торият начин за решаване на нашата задача
        boolean isValid = (number >= 100 && number <= 200) || number == 0;
        // isValid = true -> числото е валидно
        // isValid = false -> числото е невалидно
        if (isValid == false){
            System.out.println("invalid");
            //валидно чиско
        }

        // нека вкараме и трети начин, нека вкараме и отрицанието
//        boolean isValid = (number >= 100 && number <= 200) || number == 0;
        // isValid = true -> числото е валидно
        // isValid = false -> числото е невалидно
        if (!isValid){
            System.out.println("invalid");
            //валидно чиско
        }





    }
}
