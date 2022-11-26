/*
Construct a class Employee with fields and methods as follows :

Fields :
1) Name of the employee
2) Department 
3) Designation
4) Employee Id

Methods :
1) getDetails()
2) displayDetails()
3) calculateSalary() based on the following criteria : 
    a) HRA is 40% of basic salary
    b) TA is 30% of basic salary
    c) DA is 90% of basic salary
    d) Incentives = 5000
    e) PF deduction = 2500
    f) LIC deduction = 3000
*/

import java.util.Scanner;
class Employee{
    String name, dept, desg,emp_id;
    double basic_salary, gross_salary, hra, da ,ta , incentives, pf_dect,lic_dect;
    Scanner sc = new Scanner(System.in);
    
    void getDetails(){
        System.out.print("Enter name of the Employee : ");
        name = sc.nextLine();
        System.out.print("Enter department of the Employee : ");
        dept = sc.nextLine();
        System.out.print("Enter designation of the Employee : ");
        desg = sc.nextLine();
        System.out.print("Enter Employee ID : ");
        emp_id = sc.nextLine();
        System.out.print("Enter basic salary of the Employee : ");
        basic_salary = sc.nextDouble();
    }

    void displayDetails(){
        System.out.println("Name         : " + name);
        System.out.println("Department   : " + dept);
        System.out.println("Designation  : " + desg);
        System.out.println("Employee ID  : " + emp_id);
        System.out.println("Basic Salary : " + basic_salary);
    }
    
    void calculateSalary(){
        hra = 0.4*basic_salary;
        ta = 0.3*basic_salary;
        da = 0.9*basic_salary;
        incentives = 5000;
        pf_dect = 2500;
        lic_dect = 3000;
        gross_salary = (basic_salary + hra + da + ta + incentives ) - pf_dect - lic_dect ;
        System.out.println("Gross Salary : " + gross_salary);
    }
}

public class Main_18 {
    public static void main(String[] args) {
        Employee s1 = new Employee();
        s1.getDetails();
        s1.displayDetails();
        s1.calculateSalary();
    }
}
