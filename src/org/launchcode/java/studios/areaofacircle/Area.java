package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the Circle:");
        if(input.hasNextDouble()){
            double radius = input.nextDouble();
            if (radius>0){
                Double areaOfCircle = Circle.getArea(radius);
                System.out.println("The area of the circle with radius of " + radius + ":" +areaOfCircle);        }

        } else {
            System.out.println("Please enter a number greater than 0");
        }
        }
       else
           {System.out.println("please enter a valid number");
       }


}

