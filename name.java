import java.util.Scanner;

public class name{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your name:" );
        
        String name = scan.nextLine();
        
        
        int current_year = 2025;
        
        System.out.println("Enter your birth year: ");
        
        int birth_year = scan.nextInt();
        
        int age = current_year - birth_year;
        
        System.out.println("Your name is " + name + " and you are the age of " + age);
        
        
        
        
        
        
        
        
    }
}