import java.util.Scanner;

public class Exponential{
    public static void calculate(){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the Base Value ");
        int x=sc.nextInt();
        System.out.print("Enter the Power Value ");
        int n=sc.nextInt();
        
        int result = 1;
      
         for (int i = 0; i < (int) n; i++) {
             result *= x;
        }
        System.out.println("Thisis Yoour Result " +result);
    }
    
    public static void main (String[] args){
        
        calculate();
    }
}