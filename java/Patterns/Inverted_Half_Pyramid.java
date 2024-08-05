import java.util.Scanner;

public class InvertedHalfpyramid {

    public static void print() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thevalue for Pyramid ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

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
