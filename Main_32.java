import java.util.Scanner;
interface Area{
    void display(double a,double b);
}

class Circle implements Area{
    public void display(double radius,double test){
        double area_circle = 3.14*radius*radius*test;
        System.out.println("Area of cirlce is ....." + area_circle);
    }
}

class Rectangle implements Area{
    public void display(double length, double breadth){
        
        double area_rectangle = length * breadth;
        System.out.println("Area of rectangle is ..... " + area_rectangle);
    }
}

class Triangle implements Area{
    public void display(double base, double height){
        
        double area_triangle = 0.5 * base * height;
        System.out.println("Area of triangle is ..... "+area_triangle);
    }
}

public class Main_32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        String choice = "y";
        while(choice == "y"){
            System.out.println("Press 1 to calculate Area of circle ");
            System.out.println("Press 2 to calculate Area of rectangle ");
            System.out.println("Press 3 to calculate Area of triangle ");
            System.out.println("Press 4 to Exit ");
            System.out.print("Enter your choice : ");
            input = sc.nextInt();

            switch(input){
                case 1:
                    Area c1 = new Circle();
                    System.out.println("\n-------- Printing area of cirlce --------");
                    double test = 1;
                    System.out.print("Enter radius of circle : ");
                    double radius1 = sc.nextDouble();
                    c1.display(radius1,test);
                    break;
                
                case 2:
                    Area r1 = new Rectangle();
                    System.out.println("\n-------- Printing area of rectangle --------");
                    System.out.print("Enter length of rectangle : ");
                    double length1 = sc.nextDouble();
                    System.out.print("Enter breadth of rectangle : ");
                    double breadth1 = sc.nextDouble();
                    r1.display(length1,breadth1);
                    break;

                case 3:
                    Area t1 = new Triangle();
                    System.out.println("\n-------- Printing area of triangle --------");
                    System.out.print("\nEnter length of traingle : ");
                    double length2 = sc.nextDouble();
                    System.out.print("Enter base of traingle : ");
                    double base1 = sc.nextDouble();
                    t1.display(length2,base1);
                    break;
                
                case 4:
                    System.exit(0);
                    break;

                default :
                    System.out.println("Please enter a valid choice....");
            
            }
        }
    }
}

