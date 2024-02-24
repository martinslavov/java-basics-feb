package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _6_NumberInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // създавам си една целочислена променлива на конзолата
        int number = Integer.parseInt(scanner.nextLine());

        //[-100; 100] и != 0 - Yes
        // да начертая една X ос и да обяснявам по нея
        if (number >= -100 && number <= 100 && number != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

    // тествам и дебъгвам и обяснявам

}
