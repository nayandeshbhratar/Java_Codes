// Generate Salary Certificate based on previous problem statement 

import java.util.Scanner;
public class Main_13 {
    public static void main(String[] args) {
        String name ,company_name, age,  desg , emp_id, gender;
        double basic_salary, hra, da , ta, incentives, diwali_bonus, pf_dect,lic_dect,gross_salary;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of the employee : ");
        name = sc.nextLine();

        System.out.print("Enter Company name of the employee : ");
        company_name = sc.nextLine();

        System.out.print("Enter age of the employee : ");
        age = sc.nextLine();

        System.out.print("Enter Designation of the employee : ");
        desg = sc.nextLine();

        System.out.print("Enter Employee ID of the employee : ");
        emp_id = sc.nextLine();

        System.out.print("Enter Gender of the employee : ");
        gender = sc.nextLine();
        
        System.out.print("Enter basic salary of the employee : ");
        basic_salary = sc.nextDouble();

        hra = 0.4 * basic_salary;
        ta = 0.3 * basic_salary;
        da = 0.9 * basic_salary;
        incentives = 5000;
        diwali_bonus = 10000;
        pf_dect = 2500;
        lic_dect = 3000;
        gross_salary = (basic_salary + hra + da + ta + incentives + diwali_bonus) -pf_dect - lic_dect ;

        System.out.println("**************************************************");
        System.out.println("      Salary certificate of the employee is :     ");
        System.out.println("**************************************************");
        System.out.println("Name                :    " + name);
        System.out.println("Company Name        :    " + company_name);
        System.out.println("Age                 :    " + age);
        System.out.println("Designation         :    " + desg);
        System.out.println("Employee ID         :    " + emp_id);
        System.out.println("Gender              :    " + gender);
        System.out.println("Gross salary        :    " + gross_salary);
        System.out.println("**************************************************");
    }
}
