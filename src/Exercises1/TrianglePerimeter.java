package Exercises1;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A:");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side B:");
        double sideB = scanner.nextDouble();
        System.out.println("Enter side C:");
        double sideC = scanner.nextDouble();

        double perimeter = (sideA + sideB+ sideC);

        System.out.println("The perimeter of the triangle is " + perimeter+"cm");
    }
}
