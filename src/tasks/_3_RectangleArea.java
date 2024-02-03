package tasks;

import java.util.Scanner;

public class _3_RectangleArea {

    public static void main(String[] args) {

        // Ти ще се от ти Скенер и ще се казваш скенер и ще си
        // равен на нов скенер
        // и съответно ще четеш от от системата
        Scanner scanner = new Scanner(System.in);

        // и сега тук прави ли ви впечатление как съм си кръстил
        // променливата
        // тя е от две думи, но по конвенция когато кръщаваме някаква
        // променлива в java езика
        // тя винаги започва с малка буква и всяка следваща дума започва
        // с главна
        // това е така наречената конвенция camel case convention
        int firstNumber = Integer.parseInt(scanner.nextLine());
        // И отново извикваме кашона с инструменти и му казваме да
        // я конвентира към инт
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int area = firstNumber * secondNumber;

        // sout - саут това е къмплийта
        System.out.println(area);

        // Когато програмата ни е приключила с код 0, това означава,
        // че програмата ми няма
        // никакви промени и тя е приключила успешно.


    }
}
