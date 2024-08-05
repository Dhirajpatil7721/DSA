import java.util.Scanner;

public class Gcd {
    
    
    public static void greatestCommonDevisor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st value: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter your 2nd value: ");
        double n2 = sc.nextDouble();
        sc.close();

        double n3;

        if(n1<n2){
            n3 = Math.floor(n1/2);
        }else{
            n3 = Math.floor(n2/2);
        }

        int gcd = 1;
        
        for(int i=1; i<=n3;i++){
            if((n1%1)==0 && (n2%i)==0){
                gcd = i;
            }
        }
        System.out.print("Greatest Common Devisor of "+n1+" & "+n2+" is: "+gcd);
    }

    public static void main(String[] args) {
        greatestCommonDevisor();
    }
}