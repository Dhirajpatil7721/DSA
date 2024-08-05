import java.util.Scanner;

public class Hollow {
    public static void print() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows ");
        int row = sc.nextInt();
        System.out.print("Enter Number of Columns ");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print a space instead of an empty string
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print();
    }
}
