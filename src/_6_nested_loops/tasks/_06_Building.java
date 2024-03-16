package _6_nested_loops.tasks;

import java.util.Scanner;

public class _06_Building {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // брой етажи
        int countFloors = Integer.parseInt(scanner.nextLine());
        // брой стаи
        int countRooms  = Integer.parseInt(scanner.nextLine());

        // етажи: от последният към първият
        for (int floor = countFloors; floor >= 1; floor--) {
            for (int room = 0; room < countRooms ; room++) {
                // проверка на какъв етаж се намира стаята
                if (floor == countFloors) {
                    // последен етаж -> голям апартамент
                    System.out.print("L" + floor + room + " ");
                } else if (floor % 2 == 0) {
                    // четен етаж -> офис
                    System.out.print("O" + floor + room + " ");
                } else {
                    // четен етаж -> офис
                    System.out.print("A" + floor + room + " ");
                }

            }
            System.out.println();
        }

    }

}
