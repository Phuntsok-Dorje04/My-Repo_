import java.util.Scanner;

public class My_name{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter my name: ");
        
        String name = scan.nextLine();
        
        System.out.println("Enter your name");
        
        String your_name = scan.nextLine();
        
        System.out.println("My name is " + name + " and your name is " + your_name);
        
        
        
        
    }
}