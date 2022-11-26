// Calculator 

import java.util.Scanner;
import java.lang.Math;

class Calculator{
    Scanner sc = new Scanner(System.in);

    void addition(){
        double addition,addition1,addition2;
        System.out.print("Enter first number : ");
        addition1 = sc.nextDouble();
        System.out.print("Enter Second number : ");
        addition2 = sc.nextDouble();
        addition = addition1+addition2;
        System.out.print("The addition is : "+addition);
    }

    void subtraction(){
        double subtraction,subtraction1,subtraction2;
        System.out.print("Enter first number : ");
        subtraction1 = sc.nextDouble();
        System.out.print("Enter Second number : ");
        subtraction2 = sc.nextDouble();
        subtraction = subtraction1 - subtraction2;
        System.out.print("The subtraction is : "+subtraction);
    }

    void multiplication(){
        double multiplication,multiplication1,multiplication2;
        System.out.print("Enter first number : ");
        multiplication1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        multiplication2 = sc.nextDouble();
        multiplication = multiplication1*multiplication2;
        System.out.println("The multiplication is : "+multiplication);
        
    }

    void division(){
        double division1,division2,division;
        System.out.print("Enter first number : ");
        division1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        division2 = sc.nextDouble();
        division = division1/division2;
        System.out.println("The multiplication is : "+division);
    }

    void factorial(){
        double num, i=1 , factorial = 1;
        System.out.print("Enter the number : ");
        num = sc.nextDouble();
        while(i<=num){
            factorial *= i;
            i++;
        }
        System.out.println("The factorial is : "+factorial);
    }
    
    void power(){
        double num1, power1,power;
        System.out.print("Enter the number : ");
        num1 = sc.nextDouble();
        System.out.print("Enter the power : ");
        power1 = sc.nextDouble();
        power = (Math.pow(num1, power1));
        System.out.println("The power of the number is :"+power);
    }
    
    void root(){
        double num2;
        System.out.print("Enter the number : ");
        num2 = sc.nextDouble();
        System.out.println("The Square Root of the number is :"+Math.sqrt(num2));
    }
}
    


public class Main_26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        Calculator c1 = new Calculator();

        String choice = "Y";
        while(choice=="Y"){
            System.out.println("\n---------------------------------------------------------------");
            System.out.println("WhiteHouse Basic Calculator (for kids under the age of 10)");
            System.out.println("---------------------------------------------------------------");
            System.out.println("Press '1' for addition ");
            System.out.println("Press '2' for subtraction ");
            System.out.println("Press '3' for multiplication ");
            System.out.println("Press '4' for division ");
            System.out.println("Press '5' for factorial ");
            System.out.println("Press '6' for power ");
            System.out.println("Press '7' for square root");
            System.out.println("Press '8' to  exit");
            System.out.println("---------------------------------------------------------------");
            
            System.out.print("\nEnter your choice : ");
            input = sc.nextInt();
        
            switch(input){
                case 1:
                    c1.addition();
                    break;

                case 2:
                    c1.subtraction();
                    break;

                case 3:
                    c1.multiplication();
                    break;

                case 4:
                    c1.division();
                    break;

                case 5 :
                    c1.factorial();
                    break;

                case 6:
                    c1.power();
                    break;
                    
                case 7:
                    c1.root();
                    break;
                
                case 8:
                    System.exit(0);
                    break;

                default:
                    System.out.print("Enter a valid choice :");
                    break;
            }
        }
    }
}
