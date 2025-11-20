import java.util.Scanner;

public class Medicne_Store{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.println("Enter the first medicine: ");
        String first_medicine = scan.nextLine();
        System.out.println();
        
        
        System.out.println("Enter the second medicine: ");
        String second_medicine = scan.nextLine();
        System.out.println();
        
        
        System.out.println("Enter the third medicine: ");
        String third_medicine = scan.nextLine();
        System.out.println();
        
        
        System.out.println("Enter the fourth medicine: ");
        String fourth_medicine = scan.nextLine();
        System.out.println();
        
        
        System.out.println("Enter the price of " + first_medicine + ":");
        float price_1 = scan.nextFloat();
        scan.nextLine();
        System.out.println();
        

        System.out.println("Enter the price of " + second_medicine + ":");
        float price_2 = scan.nextFloat();
        scan.nextLine();
        System.out.println();
        
        
        System.out.println("Enter the price of " + third_medicine + ":");
        float price_3 = scan.nextFloat();
        scan.nextLine();
        System.out.println();
        
        
        System.out.println("Enter the price of " + fourth_medicine + ":");
        float price_4= scan.nextFloat();
        scan.nextLine();
        System.out.println();
        
        
        System.out.println("Enter the quantity of " + first_medicine + ":");
        float quan_1 = scan.nextFloat();
        System.out.println();
        
        
        System.out.println("Enter the quantity of " + second_medicine + ":");
        float quan_2 = scan.nextFloat();
        System.out.println();
        
        
        System.out.println("Enter the quantity of " + third_medicine + ":");
        float quan_3 = scan.nextFloat();
        System.out.println();
        
        
        System.out.println("Enter the quantity of " + fourth_medicine + ":");
        float quan_4 = scan.nextFloat();
        
        System.out.println();
        System.out.println("\n---- Dorje ko Ausadi Pasal ----");
        System.out.println("--------------------------------");
        System.out.printf("%-15s %-10s %-10s%n", "Name", "Price", "Quantity");
        System.out.println("---------------------------------------------");
        System.out.printf("%-15s %-10.2f %-10.2f%n", first_medicine, price_1, quan_1);
        System.out.printf("%-15s %-10.2f %-10.2f%n", second_medicine, price_2, quan_2);
        System.out.printf("%-15s %-10.2f %-10.2f%n", third_medicine, price_3, quan_3);
        System.out.printf("%-15s %-10.2f %-10.2f%n", fourth_medicine, price_4, quan_4);

        
        
        
           

        
        
        
        
        



        

        
        
        
        
        
        
        
        
        
        
        
        
    
    
        
        
        
        
    
        
        
        
    }
}