package _7_exam_preparation;

import java.util.Scanner;

public class _05_EasterEggsBattle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int eggsFirst = Integer.parseInt(scanner.nextLine());
        int eggsSecond = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean isThereAnyWinner = true;


        while (!command.equals("End")){

            if (command.equals("one")) {
                eggsSecond--;

                if (eggsSecond <= 0) {
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.%n", eggsFirst);
                    isThereAnyWinner = false;
                    break;
                }

            } else if (command.equals("two")) {
                eggsFirst--;

                if (eggsFirst <= 0) {
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", eggsSecond);
                    isThereAnyWinner = false;
                    break;
                }
            }

            command = scanner.nextLine();

        }

        if (isThereAnyWinner){
            System.out.printf("Player one has %d eggs left.%n", eggsFirst);
            System.out.printf("Player two has %d eggs left.%n", eggsSecond);
        }

    }
}
