package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _8_CinemaTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        // Monday, Tuesday, Friday -> 12
        // Wednesday, Thursday -> 14
        // Saturday, Sunday -> 16

        // Как ще го осъществя това нещо
        // Щом има едно вярно из между всчиките проверки тук, целият израз ми става верен
        // защото използвам оператора ИЛИ
        // Ако имам триста 300 условия едно да ми стане вярно, целият израз ми става верен,
        // трябва да се внимава за това
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")) {
            System.out.println(12);
        }
        // Казвам направими нова проверка, ако деня от седмицата
        // не е равен нито на Понеделник, нито на Вторник нито на сряда
        else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
            System.out.println(14);
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            System.out.println(16);
        }
    }
}
