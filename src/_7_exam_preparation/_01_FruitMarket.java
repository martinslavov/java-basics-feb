package _7_exam_preparation;

import java.util.Scanner;

public class _01_FruitMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());

        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        double strawberriesQuantity = Double.parseDouble(scanner.nextLine());

        //calculations
        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice - 0.4 * raspberriesPrice;
        double bananasPrice = raspberriesPrice - 0.8 * raspberriesPrice;

        double bananasSum = bananasQuantity * bananasPrice;
        double orangesSum = orangesQuantity * orangesPrice;
        double raspberriesSum = raspberriesQuantity * raspberriesPrice;
        double strawberriesSum = strawberriesQuantity * strawberriesPrice;

        double totalSum = (raspberriesSum + orangesSum + bananasSum + strawberriesSum);

        System.out.printf("%.2f", totalSum);
    }
}
