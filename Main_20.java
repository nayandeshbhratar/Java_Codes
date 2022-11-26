// Implement "MAIN_18.java" using parameterized constructor with parameter "basic salary"

import java.util.Scanner;
class Employee{
    double basic_salary;
    Employee(double basic_sal){
        basic_salary = basic_sal;
    }

    String name, dept, desg,emp_id;
    double gross_salary, hra, da ,ta , incentives, pf_dect,lic_dect;
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
        gross_salary = (basic_salary + hra + da + ta + incentives ) -pf_dect - lic_dect ;
        System.out.println("Gross Salary : " + gross_salary);
    }
}

public class Main_20 {
    public static void main(String[] args) {
        double bas_sal;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter basic salary : ");
        bas_sal = myObj.nextDouble();
        Employee e1 = new Employee(bas_sal);
        e1.getDetails();
        e1.displayDetails();
        e1.calculateSalary();
    }
}