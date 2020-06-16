package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         System.out.println("Enter miles driven:");
         float miles = input.nextFloat();
         System.out.println("Enter gallons of gas consumed:");
         float gas = input.nextFloat();
         float milesPerGallon = miles / gas;
         System.out.println("Your gas mileage is " + milesPerGallon +"mpg.");
    }
}
