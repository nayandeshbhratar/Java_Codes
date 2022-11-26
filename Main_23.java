// Inheritance with constructor

import java.util.Scanner;
class Employee{
  String name, emp_id;
  Employee(String name1, String emp_id1){
    name = name1;
    emp_id = emp_id1;
  }
  void displayDetails(){
    System.out.println("Name         : "+name);
    System.out.println("Employee Id  : "+emp_id);
  }
}

class Professor extends Employee{
  float salary;
  Professor(String name1, String emp_id1,float salary1) {
    super(name1, emp_id1);
    salary = salary1;
  }  
  void displaySalary(){
    System.out.println("Salary       : "+salary);
  }
}

public class Main_23{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String name2,emp_id2;
    float salary2;
    System.out.print("Enter name : ");
    name2 = sc.nextLine();
    System.out.print("Enter Employee Id : ");
    emp_id2 = sc.nextLine();
    System.out.print("Enter Salary : ");
    salary2 = sc.nextFloat();
    Professor p1 = new Professor(name2, emp_id2, salary2);
    p1.displayDetails();
    p1.displaySalary();
  }
}
