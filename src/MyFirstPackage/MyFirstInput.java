package MyFirstPackage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyFirstInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("------------");
        System.out.println("The entered name is: "+ name);
    }
}
