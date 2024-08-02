import java.util.Scanner;

class Voter{
    
    public static void vote(){
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter Your Age :");
        int age=sc.nextInt();
        System.out.println("Your Age is :" + age);
        
      if(age<=17){
        System.out.print("Sorry!  Your Age is :" + age + "  not applicable for the vote...Try after some years");
                }
        else if(age>18){
        System.out.println("Excelent!  Your Age is :" + age + " you are applicable for the vote...Thank You");
        
            
        }
        
    }
    
    
    public static void main (String []args){
        
        vote();
    }
    
}