package Calculator;

import java.util.Scanner;
public class calculator{
    Scanner sc = new Scanner(System.in);

    public void addition(){
        double addition,addition1,addition2;
        System.out.print("Enter first number : ");
        addition1 = sc.nextDouble();
        System.out.print("Enter Second number : ");
        addition2 = sc.nextDouble();
        addition = addition1+addition2;
        System.out.print("The addition is : "+addition);
    }

    public void subtraction(){
        double subtraction,subtraction1,subtraction2;
        System.out.print("Enter first number : ");
        subtraction1 = sc.nextDouble();
        System.out.print("Enter Second number : ");
        subtraction2 = sc.nextDouble();
        subtraction = subtraction1 - subtraction2;
        System.out.print("The subtraction is : "+subtraction);
    }

    public void multiplication(){
        double multiplication,multiplication1,multiplication2;
        System.out.print("Enter first number : ");
        multiplication1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        multiplication2 = sc.nextDouble();
        multiplication = multiplication1*multiplication2;
        System.out.println("The multiplication is : "+multiplication);
        
    }

    public void division(){
        double division1,division2,division;
        System.out.print("Enter first number : ");
        division1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        division2 = sc.nextDouble();
        division = division1/division2;
        System.out.println("The multiplication is : "+division);
    }   

    public void displayCalci(){
        int input;
        calculator c1 = new calculator();

        String choice = "Y";
        while(choice=="Y"){
            System.out.println("\n---------------------------------------------------------------");
            System.out.println("Basic Calculator (for kids under the age of 10)");
            System.out.println("---------------------------------------------------------------");
            System.out.println("Press '1' for addition ");
            System.out.println("Press '2' for subtraction ");
            System.out.println("Press '3' for multiplication ");
            System.out.println("Press '4' for division ");
            System.out.println("Press '5' to  exit");
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

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.print("Enter a valid choice..................");
                    break;

            }
        }
    }
}
    
