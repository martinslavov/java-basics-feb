package _1_first_steps_in_coding;

import java.util.Scanner;

public class _6_ConcatenateData {

    // Защо трябва да напишем public static void main
    // защото днес разбрахме, че нашата програма трябва да има стартова точно
    // трябва да има място от кудето нашата програма да може да се стартира и компилира
    public static void main(String[] args) {

        // Нека работим като профисионалисти
        // и да си разбием програмата на по-малки парчета код
        // Първо какво ми трябва, калс, създадох го
        // Второ трябва ни стартова точка
        // Трето какв ни трябва - скенер

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        // за годините какво ни трябва Стринг, инт или даоубле
        // това е цялочислено число, следователно ни трябва инт
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        // Да го обясня бавно и много подробно
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);

    }
}
