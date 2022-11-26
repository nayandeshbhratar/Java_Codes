// Interface 

interface Area{
    void display();
}

class Circle implements Area{
    public void display(){
        System.out.println("Printing area of cirlce ");
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();
    }

}
