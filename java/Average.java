import java.util.Scanner;
public class Average{
    
    public static void PrintAverage(){
            
            Scanner sc=new Scanner(System.in);
            
            System.out.print("Enter First Number");
            int a= sc.nextInt();
            
            System.out.print("Enter Second Number");
            int b=sc.nextInt();
            
            System.out.print("Enter First Number");
            int c=sc.nextInt();
             sc.close();
             
            int sum=a+b+c;
            System.out.println("The sum of no is "+sum );
            
            int avg= sum / 3;
         System.out.println("The Average is "+avg);
        }
                 
    
    public static void main (String []args){
        PrintAverage();
        
    }
    
}