package Exercises1;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of a triangle:");
        double baseOfATriangle = scanner.nextDouble();
        System.out.println("Enter the height of a triangle:");
        double heighOfATriangle = scanner.nextDouble();


        double areaTriangle = baseOfATriangle * heighOfATriangle /2 ;

        System.out.println("The area of the triangle is " + areaTriangle+" cm²");
    }
}
