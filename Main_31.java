interface Area{
    void display();
}

class Circle implements Area{
    public void display(){
        System.out.println("Printing area of cirlce... ");
    }
}

class Rectangle implements Area{
    public void display(){
        System.out.println("Printing area of rectangle... ");
    }
}

class Triangle implements Area{
    public void display(){
        System.out.println("Printing area of triangle... ");
    }
}

public class Main_31 {
    public static void main(String[] args) {
        Area c1 = new Circle();
        c1.display();

        Area r1 = new Rectangle();
        r1.display();

        Area t1 = new Triangle();
        t1.display();
    }
}