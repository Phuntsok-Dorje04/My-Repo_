import java.util.Scanner;

public class Waterlevelmonitor{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----💧Water Level Monitor💧----");
        System.out.println();
        System.out.println("Enter the current water level: ");
        System.out.println();
        float water_level = scan.nextFloat();
        
        System.out.println("The current water level is " + water_level + " l");
        System.out.println();
        String warning = (water_level >=1000)? "Warning! Water level has reached its maximum capacity" : "Normal Level!";
        System.out.println();
        System.out.println(warning);
        
        
        
        
        
        
        
    }
}