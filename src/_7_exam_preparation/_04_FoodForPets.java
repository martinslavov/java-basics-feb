package _7_exam_preparation;

import java.util.Scanner;

public class _04_FoodForPets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double sumFoodEatenByDog = 0;
        double sumFoodEatenByCat = 0;
        double sumBiscuits = 0;

        for (int day = 1; day <= countDays; day++) {
            int foodEatenByDog = Integer.parseInt(scanner.nextLine());
            int foodEatenByCat = Integer.parseInt(scanner.nextLine());

            if (day % 3 == 0){
                sumBiscuits += (foodEatenByDog + foodEatenByCat) * 0.1;
            }

            sumFoodEatenByDog += foodEatenByDog;
            sumFoodEatenByCat += foodEatenByCat;
        }

        double sumAllEatenFood = sumFoodEatenByDog + sumFoodEatenByCat;

        double percentageEatenFood = (sumAllEatenFood / totalFood) * 100;
        double percentageEatenFromDog = (sumFoodEatenByDog / sumAllEatenFood) * 100;
        double percentageEatenFromCat = (sumFoodEatenByCat / sumAllEatenFood) * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(sumBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentageEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentageEatenFromDog);
        System.out.printf("%.2f%% eaten from the cat.", percentageEatenFromCat);


    }
}
