package tasks;

import java.util.Scanner;

public class _9_YardGreening {

    public static void main(String[] args) {

        // реално число, означава double число
        // нека преди да решим задачата да си я разбием на по-малки проблеми, след което
        // да започнем да я решаваме
        Scanner scanner = new Scanner(System.in);
        double sqrMeters = Double.parseDouble(scanner.nextLine());
        double amount =  sqrMeters * 7.61;
        // делено 18 на 100, за да получим 18 процента
        // или може да запишем доректно 0.18
        double discount = amount * 18 / 100;

        double sumAfterDiscount = amount - discount;

//        System.out.printf("The final price is: %f lv.%n", sumAfterDiscount);
//        System.out.printf("The discount is: %f lv.", discount);


         System.out.printf("The final price is: %.2f lv.%n", sumAfterDiscount);
         System.out.printf("The discount is: %.2f lv.", discount);

    }
}
