import java.util.Scanner;
public class Solid{
    public static void print(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of rows ");
        int row=sc.nextInt();
        System.out.print("Enter Number of Columns ");
        int col=sc.nextInt();
        
        for(int i=0;i<row;i++){
            for(int j=0; j<col;j++){
                
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        
    }
    
    public static void main(String [] args){
        
        print();
    }
    
} 