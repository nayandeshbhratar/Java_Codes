/*
Construct a program to print the following details of a student using class :
1) Name of the studnet 
2) Roll number of the student 
*/


// Main function defined outside the class

class Student{
    String name;
    int roll_no;
}

public class Main_15 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Nayan";
        s1.roll_no = 13;
        
        System.out.println("Name is : "+s1.name);
        System.out.println("Roll number is : "+s1.roll_no);
    }    
}
