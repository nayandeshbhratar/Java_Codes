import java.util.Scanner;
import mypack.*;

public class Main_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1,b1;
        System.out.println("Enter first number : ");
        a1 = sc.nextInt();

        System.out.println("Enter second number : ");
        b1 = sc.nextInt();
        Addition A = new Addition(a1,b1);
        A.displayDetails();

        //Addition A1 = new Addition(12, 36);
        //A1.displayDetails();
    }
}