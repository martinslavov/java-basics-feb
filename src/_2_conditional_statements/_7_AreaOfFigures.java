package _2_conditional_statements;

import java.util.Scanner;

public class _7_AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // лице на квадрат а * а
        // лице на триъгълник - P по радиусна на квадрат
        // лице на правоъгълник а * б
        // лице на триъгълник - основата по височината на 2

        String typeFigure = scanner.nextLine();

        // Да обясня че няма нужда да го пиша във всеки if
        // и че е бест практикс да го изнеса
        // DEBUG - да дебугна програмата и да обяснявам
        // Програмта ми стартиране дикектно се инит-ва до бреак поинт-а
        double area = 0;
        if("square".equals(typeFigure)){
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
        } else if ("rectangle".equals(typeFigure)) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            area = length * width;

            // може да допусна грешка и да добавя space и да обясня, че space също е символ
        } else if ("circle".equals(typeFigure)) {
            double radius = Double.parseDouble(scanner.nextLine());
            // за да не го търсим в google защото беше 3.14 и нещо си, може да го достъпим по следният начин
            // как е на квадрат, ами два път радиуса/
            area = Math.PI * radius * radius;
        } else if ("triangle".equals(typeFigure)) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = base * height / 2;
        }

        System.out.printf("%.3f", area);

    }
}
