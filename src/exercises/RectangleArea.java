package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        double length = input.nextDouble();
        System.out.println("Enter  of width of rectangle");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
