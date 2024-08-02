import java.util.Scanner;

class Circle{
    
    public static void circumference(){
        
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter The Radius First : ");
        int r=sc.nextInt();
        
        System.out.println("Your Radius : "+r+"cm");
        
        
        double result= 2 * 3.14 * r;
        
        
    System.out.println("Here the circumference of radius "+r+ " is : "+ result+ "cm")   ; 
    }
    
    
    public static void main (String[]args){
        circumference();
        
        
    }
    
}