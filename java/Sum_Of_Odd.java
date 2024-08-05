
// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;

public class Sum_Of_Odd {

    public static void Sum() {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int Sum = 0;
        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                Sum += i;
            }
        }
        System.out.println("Sum of All Odd Numbers up to " + n + " is: " + Sum);

    }

    public static void main(String[] args) {

        Sum();
    }
}