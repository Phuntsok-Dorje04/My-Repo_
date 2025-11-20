import java.util.Scanner;

public class calculater{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----CALCULATER----");
        
        System.out.println("Enter first number: ");
        
        float a = scan.nextFloat();
        
        System.out.println("Enter second number: ");
        
        Float b = scan.nextFloat();
        
        float sum = a + b;
        
        float div = a / b;
        
        float product = a * b;
        
        float sub = a - b;
        
        System.out.println("The sum of " + a + " and" + b + " is " + sum);
        System.out.println();
        System.out.println("The product of " + a + " and" + b + " is " + product);
        System.out.println();
        System.out.println("The divison of " + a + " and" + b + " is " + div);
        System.out.println();
        System.out.println("The subtracted value of " + a + "and" + b + "is " + sub);
        
        
        
        
        
        
        
        
        
    
        
        
    
        
        
       
    }
}