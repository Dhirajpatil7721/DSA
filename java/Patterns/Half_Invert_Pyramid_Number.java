import java.util.Scanner;

public class Half_Invert_Pyramid_Number {
    public static void print() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for Number Pyramid ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print();
    }
}