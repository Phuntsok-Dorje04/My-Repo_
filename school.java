import java.util.Scanner;

public class school{
    public static void main(String [] args){
        
        Scanner scan = new  Scanner (System.in);
        
        System.out.println("Enter your name dear student: ");
        
        String student_name = scan.nextLine();
        
        System.out.println("Enter your age ");
        
        int age = scan.nextInt();
        
        System.out.println("Enter your GPA: ");
        
        Double GPA = scan.nextDouble();
        
        System.out.println("The name of the student is " + student_name);
        System.out.println();
        System.out.println("Their age is " + age);
        System.out.println();
        System.out.println("Their GPA is " + GPA);
        
    
        
    }
}