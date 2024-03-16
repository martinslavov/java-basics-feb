package _6_nested_loops.tasks;

public class
_02_MultiplicationTable {

    public static void main(String[] args) {

        // първи множител от 1 до 10
        // втори множител от 1 до 10

        for (int first = 1; first <= 10; first++) {
            for (int second = 1; second <= 10; second++) {
                System.out.println(first + " * " + second + " = " + (first * second));

            }
        }


    }
}
