package Exercises1;

import java.util.Scanner;

public class PersonNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your second name: ");
        String secondName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("The person's is called: " + firstName+ " " + secondName+ " " + lastName);
    }
}
