package _7_exam_preparation;

import java.util.Scanner;

public class _03_MovieDestination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (season.equals("Summer")){
            switch (destination){
                case "Dubai" :
                    double p = (days * 40000) * 0.30;
                    totalPrice = (days * 40000) - p;
                    break;
                case "Sofia":
                    totalPrice = (days * 12500) + (days * 12500) * 0.25;
                    break;
                case "London" :
                    totalPrice = days * 20250;
                    break;
            }
        } else {
            switch (destination){
                case "Dubai" :
                    totalPrice = (days * 45000) - (days * 45000) * 0.30;
                    break;
                case "Sofia":
                    totalPrice = (days * 17000) + (days * 17000) * 0.25;
                    break;
                case "London" :
                    totalPrice = days * 24000;
                    break;
            }
        }


        if (budget >= totalPrice) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", (budget - totalPrice));
        } else if (budget < totalPrice) {
            System.out.printf("The director needs %.2f leva more!", (totalPrice - budget));
        }

    }

}
