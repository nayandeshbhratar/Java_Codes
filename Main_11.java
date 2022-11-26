// Construct a program to read the name of student from an end user & print the same.

import java.util.Scanner;
public class Main_11 {
    public static void main(String[] args) {
        System.out.print("Enter your name :");
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println("Name entered is : " + name);
    }
}
