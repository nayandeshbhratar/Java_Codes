/*
Construct a program to print marksheet of a student with the following details :
1) Name of the student 
2) Department 
3) Year 
4) Section
5) Marks obtained in 5 different subjects 
6) Total marks 
7) Percentage 
8) Grade depending upon the following criteria :
    a) If percentage is greater than equal to 75, grade is A+
    b) If percentage is greater than equal to 65 and less than 75, grade is A
    c) If percentage is greater than equal to 55 and less than 65, grade is B
    d) If percentage is greater than equal to 45 and less than 65, grade is C
    e) If percentage is less than equal 45, grade is F
*/

public class Main_09 {
    public static void main(String[] args) {
        String name, dept, year;
        name = "Nayan";
        dept = "ETC";
        year = "Second";
        char sec = 'A';
        int marks1, marks2 ,marks3, marks4, marks5;
        marks1 = 68;
        marks2 = 78;
        marks3 = 95;
        marks4 = 76;
        marks5 = 94;
        int total_marks = marks1+ marks2 +marks3 + marks4+  marks5;
        float percentage = total_marks/5.0f;
        String grade;
        if (percentage >= 75){
            grade = "A+";
        }
        else if (percentage >=65 && percentage <75){
            grade = "A";
        }
        else if (percentage >=55 && percentage<65){
            grade = "B";
        }
        else if (percentage>=45 && percentage < 55){
            grade = "C";
        }
        else {
            grade = "F";
        }

        System.out.println("************************************************");
        System.out.println("    \nMarksheet of the student is :      ");
        System.out.println("************************************************");
        System.out.println("Name                    :            " +name);
        System.out.println("Department              :            " +dept);  
        System.out.println("Year                    :            " +year);
        System.out.println("Section                 :            " +sec);
        System.out.println("Marks 1                 :            " +marks1);
        System.out.println("Marks 2                 :            " +marks2);    
        System.out.println("Marks 3                 :            " +marks3);
        System.out.println("Marks 4                 :            " +marks4);
        System.out.println("Marks 5                 :            " +marks5);
        System.out.println("Total marks             :            " +total_marks);
        System.out.println("Percentage              :            " +percentage);
        System.out.println("Grade                   :            " +grade);
        System.out.println("************************************************");

    }
}
