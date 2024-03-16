package _6_nested_loops.tasks;

import java.util.Scanner;

public class _03_Combinations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // първото число: от 1 до n
        // второ число: от 1 до n
        // трето число: от 1 до n

        int count = 0; // брой на валидни комбинации
        for (int first = 0; first <= n; first++) {
            for (int second = 0; second <= n; second++) {
                for (int third = 0; third <= n; third++) {
                    // комбинация от три числа: first, second, third
                    int sum = first + second + third;
                    if (sum == n){
                        // валидна комбинация
                        count++;
                    }
                }
            }
        }

        // всички комбинации
        System.out.println(count);


    }

}
