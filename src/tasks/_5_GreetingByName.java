package tasks;

import java.util.Scanner;

public class _5_GreetingByName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Защо не трябват никакви парсвания, ами защото всяка иформация която четем от конзолата, тя вече си е стринг
        String name = scanner.nextLine();

        // Колегите са дали примера по следният начин. Обяснявам какво прави
        System.out.print("Hello, "); // курсора ще остане на същият ред
        System.out.print(name);
        System.out.println("!"); // тъй като тук имам ln, new line, след като принтираме, курсора ще слезе на следващият ред

        // Но може да го напишем и по различен начин
        // За да не пиша три мъти System.out.println, как да го напиша само с един System.out.println
        // Ами с конкатенация. В програмирането долепянето на текс се нарича конкатенация
        System.out.println("Hello, " + name + "!");
        // Конканетацията се прави с +
        // Да покажа за разликите на курсора с print и println




    }
}
