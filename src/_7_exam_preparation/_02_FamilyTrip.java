package _7_exam_preparation;

import java.util.Scanner;

public class _02_FamilyTrip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerDay = Double.parseDouble(scanner.nextLine());
        int percentAdditionalMoney = Integer.parseInt(scanner.nextLine());

        // проверка дали нощувките са повече са от 7
        if (days > 7){
            // процент отстъпка
            pricePerDay = pricePerDay - (pricePerDay * 0.05);
        }

        // изчисляваме цената за всички дни
        double priceForAllDays = days * pricePerDay;

        // изичсляване на допълнителните разходи
        double additionalMoney = ( percentAdditionalMoney / 100.00 ) * budget;

        // тук изчисляваме всички пари които ще ни трябват
        double neededMoney = priceForAllDays + additionalMoney;

        // изчисляваме разликата
        double diff = Math.abs(neededMoney - budget);

        if (budget >= neededMoney){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }


    }
}
