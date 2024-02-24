package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _5_SmallShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String product = scanner.nextLine(); // закупен продукт
        String town = scanner.nextLine(); // град
        // създавам една 3-та променлива в която ще държа количестото,
        // ще чета от конзолата и ще запазвам това количестов в нея
        double quantity = Double.parseDouble(scanner.nextLine()); // количество

        // нашата задача е да намерим крайната цена която сме заплатили за да имаме даден продукт
        // крайна цена = количеството * ед.цена(зависи от product и town)

        double price = 0; // тук ще държа единичната цена напродукта
        // но понеже не я знам тази цена все още каква ще е, тъй като за различните
        // градове е различна, аз ще и задам цена 0

        // 1. проверка за града -> Sofia, Plovdiv, Varna
        switch (town){
            case "Sofia":
                // продуктът е купен в София

                // тук вече трябва да правя проверка, кой продукт е купен

                // Виждате че в switch case конструкция може да слагаме if, няма проблеми
                // в if можем да слагаме if
                // switch -> switch
                // можем и да ги слесваме, няма променливи
                // сега, проверката за кой продукт е купем, е направиихме със серия от проверки
                // защото за променливата продукт искаме да направим серия от проверки и само
                // една да изпълним
                if (product.equals("coffee")){
                    // за да влезем тук в това исловие, ние трябва да сме направили проверка
                    // и да сме установили че сме си купили кафе от София
                    // нека видим каква е единичната цена на продукт-а
                    price = 0.50;
                } else if (product.equals("water")){
                    price = 0.80;
                } else if (product.equals("beer")){
                    price = 1.20;
                } else if (product.equals("sweets")){
                    price = 1.45;
                } else if (product.equals("peanuts")){
                    price = 1.60;
                }
                break;
            case "Plovdiv":
                // продуктът е купен в Пловдив

                if (product.equals("coffee")){
                    price = 0.40;
                } else if (product.equals("water")){
                    price = 0.70;
                } else if (product.equals("beer")){
                    price = 1.15;
                } else if (product.equals("sweets")){
                    price = 1.30;
                } else if (product.equals("peanuts")){
                    price = 1.50;
                }
                break;
            case "Varna":
                // продуктът е купек във Варна
                if (product.equals("coffee")){
                    price = 0.45;
                } else if (product.equals("water")){
                    price = 0.70;
                } else if (product.equals("beer")){
                    price = 1.10;
                } else if (product.equals("sweets")){
                    price = 1.35;
                } else if (product.equals("peanuts")){
                    price = 1.55;
                }
                break;
        }

        // Почто сме готови с нашата зада. От switch case конструкцията ние разбираме ед. цена,
        // след рова просто трябва да умножим ед. цена, по броят на закупените продулти

        double totalPrice = quantity * price;
        System.out.println(totalPrice);

        // Да покажа как се прибира цялата конструкция switch, if
    }

}
