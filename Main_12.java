/*
Write a program to calculate salary of an employee based on the following criteria :
1) HRA = 40 % of Basic Salary 
2) TA = 30 % of Basic Salary 
3) DA = 90 % of Basic Salary 
4) Incentives = 5000
5) Diwali Bonus = 10000
6) PF Deduction = 2500 
7) LIC Deduction = 3000
*/

import java.util.Scanner;
public class Main_12 {
    public static void main(String[] args) {
        double basic_salary, hra, da , ta, incentives, diwali_bonus, pf_dect,lic_dect,gross_salary;
        Scanner sc = new Scanner(System.in);
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
        System.out.print("Gross salary of the employee is : " + gross_salary);
    }
}
