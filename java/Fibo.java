// Write a program to print Fibonacci series of n terms where n is input by user: 011235 8 13 24 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
import java.util.Scanner;
public class Fibo {
    public static void print() {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the range of Series ");
int n=sc.nextInt();


        int n1=0 ,n2=1;
        
        for(int i=1;i<=n;i++){
            System.out.print(n1+" ");
            int sum=n1+n2;
            n1 = n2;
            n2=sum;
            
}
    }

    public static void main(String[] args) {

        print();
    }
}