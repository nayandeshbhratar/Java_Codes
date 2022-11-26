// Normal Inheritance

import java.util.Scanner;
class Employee{
  String name, emp_id;

  void displayDetails(){
    System.out.println("Name         : "+name);
    System.out.println("Employee Id  : "+emp_id);
  }
}

class Professor extends Employee{
  float salary;

  void displaySalary(){
    System.out.println("Salary       : "+salary);
  }
}

public class Main_22{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Professor p1 = new Professor();
    System.out.print("Enter name : ");
    p1.name = sc.nextLine();
    System.out.print("Enter Employee Id : ");
    p1.emp_id = sc.nextLine();
    System.out.print("Enter Salary : ");
    p1.salary = sc.nextFloat();
    p1.displayDetails();
    p1.displaySalary();
  }
}