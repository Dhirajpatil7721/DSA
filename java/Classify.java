
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.Scanner;
import java.util.Stack;

class Classify {

    public static void Get() {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int stop = 1000;

        while (true) {
            System.out.print("Enter a number (type '1000' to finish): ");
            int input = sc.nextInt();

            if (input == stop) {
                break;
            }
            stack.push(input);
        }
        System.out.println(stack);

        int Positive = 0;
        int Negative = 0;
        int Zero = 0;

        for (int i = 0; i < stack.size(); i++) {
            int num = (int) stack.get(i);
            if (num > 0) {
                Positive++;
            } else if (num < 0) {
                Negative++;
            } else {
                Zero++;
            }
        }

        System.out.println("The count of Positive Number is: " + Positive);
        System.out.println("The count of Zero Number is: " + Zero);
        System.out.println("The count of Negative Number is: " + Negative);
    }

    public static void main(String[] args) {
        Get();
    }
}
