/*
Write a program to calculate salary of an employee based on the following criteria :
1) HRA = 40 % of Basic Salary 
2) TA = 30 % of Basic Salary 
3) DA = 90 % of Basic Salary 
4) Incentives = 5000
5) Basic Salary = 30000
*/

public class Main_04 {
    public static void main(String[] args ){
        float basic_sal = 30000;
        float hra = (float) (0.4 * basic_sal);
        float ta = (float) (0.3 * basic_sal);
        float da = (float) (0.9 * basic_sal);
        float incentives = 5000;
        float gross_salary = basic_sal + hra + ta + da + incentives;
        System.out.println("The salary of employee is " +gross_salary);

    }
}
