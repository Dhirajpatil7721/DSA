import java.util.Scanner;

public class Half_Pyramid {

    public static void print() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for Pyramid ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        print();
    }

}
