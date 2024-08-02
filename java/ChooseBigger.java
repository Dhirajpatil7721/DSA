import java.util.Scanner;
public class ChooseBigger{
    
    public static void Bigger(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number ");
        int a=sc.nextInt();
        System.out.println("Enter the First Number ");
        int b=sc.nextInt();
        
        sc.close();
        
        if(a>b){
           System.out.println("First Number is greater than"+a+"  > "+b+" Second Number" ) ;
        }
        else if(b>a){
           System.out.println("Second Number is greater "+b+" than > "+a+ " First Number" ); 
        }
        else{
            System.out.println("Both Numbers are same "+a+" = "+b);
        }
    } 
    
    
    
    public static void main(String [] args){
        Bigger();
    }
}