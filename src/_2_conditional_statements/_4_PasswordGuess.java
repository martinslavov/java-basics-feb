package _2_conditional_statements;

import java.util.Scanner;

public class _4_PasswordGuess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        // т.е. аз тук ще попитам, инпута който получавам като код, равен ли е на паролата
        // да обясня и бест практис защо не се проверява така, а трябва да е в обратен ред
        // докато обяснявам да чертая
        if (password.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

        // Защо използваме equals вместо ==, явно колегата ще трябва да си върне записа от по-рано и да го изледа наново
        // Ще се опитам да го обясня пак, защото когато използваме ==, ние сравняваме по референция, т.е. гледаме
        // дали двете стойности сочат към едно и също място в паметта, а не да ли са с една и съща стойнсот.
        // Т.е. ако сравни две еднакви стойности с ==, но те сочат към различни адреси в паметта ние ще получил FALSE,
        // но ако ги сравним с equals, ние ще получим TRUE

    }
}
