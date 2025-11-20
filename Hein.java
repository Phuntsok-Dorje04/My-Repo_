import java.util.Scanner;


public class Hein{
    public static void main(String [] args){
        System.out.println("Birth year calculater");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your age ");
        
        int age = scan.nextInt();
        
        System.out.println("Enter the current year: ");
        
        int current_year = scan.nextInt();
        
        int birth_year = current_year - age;
        
        System.out.println("You were born on " + birth_year);
        
        
        
        
    }
}