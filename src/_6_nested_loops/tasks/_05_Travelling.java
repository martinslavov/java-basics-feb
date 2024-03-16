package _6_nested_loops.tasks;

import java.util.Scanner;

public class _05_Travelling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // повтаряме: въвеждаме входни данни (дестинация или "End")
        // спираме: входни данни == "End"

        // продължаваме: входни данни != "End"
        String input = scanner.nextLine();

        while (!input.equals("End")) {

            // нужни пари за въведената дестинация
            double needMoney = Double.parseDouble(scanner.nextLine());

            // спестяване
            // повтаряме: въвеждаме сума + спестяване
            // спираме: спестените пари >= needMoney
            // продължаваме: спестените пари <= needMoney
            double savedMoney = Double.parseDouble(scanner.nextLine());
            while (savedMoney < needMoney) {
                // спестени пари
                double sumForSave = Double.parseDouble(scanner.nextLine());
                savedMoney += sumForSave;
            }

            // има налична сума: savedMoney => needMoney -> отива на почивка
            System.out.println("Going to " + input + "!");

            // input - съхранява дестинацията
            input = scanner.nextLine();
        }

    }
}
