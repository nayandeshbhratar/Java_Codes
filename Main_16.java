/*
Construct a program to print the following details of a student using class :
1) Name of the studnet 
2) Roll number of the student 
*/

// Class with method 

class Student {
    String name;
    int roll_no; 

    void display(){
        System.out.println("Name is : "+name);
        System.out.println("Roll number is : "+roll_no);

    }
}

public class Main_16 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nayan";
        s1.roll_no = 13;
        s1.display();
    }
}
