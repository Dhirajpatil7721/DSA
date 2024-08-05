import java.util.Scanner;

public class Zero_One_Triangle {
    public static void print() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for Continues Number Pyramid ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        print();
    }
}
