package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _2_WeekendOrWorkingDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        // Monday -> Working day
        // Tuesday -> Working day
        // Wednesday -> Working day
        // Thursday -> Working day
        // Friday -> Working day
        // Saturday -> Weekend
        // Sunday -> Weekend

        // Серия от проверки за точни стоиности

        switch (day){
//            case "Monday":
//                System.out.println("Working day");
//                break;
//            case "Tuesday":
//                System.out.println("Working day");
//                break;
//            case "Wednesday":
//                System.out.println("Working day");
//                break;
            // Тук обаче нещата започват да не изглеждат добре, защото какво правим, пишем код който
            // върши едно и също нещо
            // Когато имаме 3 кейс-а, които вършат едно и също нещо, ние можем просто да ги обединим
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            // Тук казвам, че при всеки един от тези случай които имам искам да ми се принтира на
            // конзолата "Working day"
            // И това се нарича, обединяване на кейсове в нашата switch конструкция
            case "Saturday":
            case "Sunday":
                    System.out.println("Weekend");
                break;
            default:
                    System.out.println("Error");
                break;

                // Хайде сега да видим как работи нашата задача


        }

    }
}
