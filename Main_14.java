/*
Construct a program to print the following details of a student using class :
1) Name of the studnet 
2) Roll number of the student 
*/


// Main function defined within the class

public class Main_14 {
    String name;
    int roll_no;

    public static void main(String[] args) {
        Main_14 s1 = new Main_14();
        s1.name = "Nayan";
        s1.roll_no = 13;

        System.out.println("Name of the student is : "+s1.name);
        System.out.println("Roll number of the student is : "+s1.roll_no);
        
    }
}
