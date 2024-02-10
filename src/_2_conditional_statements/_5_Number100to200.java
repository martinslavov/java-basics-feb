package _2_conditional_statements;

import java.util.Scanner;

public class _5_Number100to200 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        // Вина ги си копирайте текст-а който искате да принтирате, за да не допуснете
        // някакво тайпо, защото след това ще се чудите какво се случва
        //
        // НИЕ СЕ ЗАПОЗНАХМЕ С ДЕБЪГ МОД-А, НО ДО СЕГА НЕ СМЕ ГО ИЗПОЛЗВАЛИ И ТУК Е УДОБЕН СЛУЧАЙ
        if (number < 100){
            System.out.println("Less than 100");
        } else if (number <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }

    }

}
