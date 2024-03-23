package _7_exam_preparation;

import java.util.Scanner;

public class _06_BarcodeGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String number = "1234";
//        int startString = Integer.valueOf(String.valueOf(number.charAt(0)));
//        System.out.println(startString);
//
//        int t = Integer.parseInt(number.substring(0,1));
//        System.out.println(t);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int firstStart = Integer.parseInt(Integer.toString(start).substring(0, 1));
        int secondStart = Integer.parseInt(Integer.toString(start).substring(1, 2));
        int thirdStart = Integer.parseInt(Integer.toString(start).substring(2, 3));
        int fourthStart = Integer.parseInt(Integer.toString(start).substring(3, 4));

        int firstEnd = Integer.parseInt(Integer.toString(end).substring(0, 1));
        int secondEnd = Integer.parseInt(Integer.toString(end).substring(1, 2));
        int thirdEnd = Integer.parseInt(Integer.toString(end).substring(2, 3));
        int fourthEnd = Integer.parseInt(Integer.toString(end).substring(3, 4));

        for (int i = firstStart; i <= firstEnd ; i++) {

            for (int j = secondStart; j <= secondEnd ; j++) {

                for (int k = thirdStart; k <= thirdEnd; k++) {

                    for (int l = fourthStart; l <= fourthEnd; l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0){
                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(k);
                            System.out.print(l);
                            System.out.print(" ");
                        }

                    }

                }

            }

        }

    }

}
