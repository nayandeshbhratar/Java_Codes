// Generate Scorecard based on Practical 01

import java.util.Scanner;
class Grader{
    String name ,dept,year,grade,sec,result,gender;
    float score1,score2,score3,score4,score5,percentage;

    Scanner sc = new Scanner (System.in);

    void letter_grade(){
        System.out.print("Enter name of the Student : ");
        name = sc.nextLine();

        System.out.print("Enter gender of the Student : ");
        gender = sc.nextLine();

        System.out.print("Enter department of the student : ");
        dept = sc.nextLine();

        System.out.print("Enter year of studying : ");
        year = sc.nextLine();

        System.out.print("Enter section of student : ");
        sec = sc.next();

        System.out.print("Enter score in Subject 1 : ");
        while(true){
            score1 = sc.nextFloat();
            if(score1>=95&&score1<=100) {
                break;
            }
            else if (score1>=75 && score1 <95){
                break;
            }
            else if (score1>=65 && score1 <75){
                break;
            }   
            else if (score1>=55 && score1 <65){
                break;
            }
            else if (score1>=40 && score1 <55){
                break;
            }
            else if (score1<40 && score1 >=0){
                break;
            }
            else{
                System.out.print("Please enter a valid score for subject 1: ");
                continue;
            }
        }

        System.out.print("Enter score in Subject 2 : ");
        while(true){
            score2 = sc.nextFloat();
            if(score2>=95&&score2<=100) {
                break;
            }
            else if (score2>=75 && score2 <95){
                break;
            }
            else if (score2>=65 && score2 <75){
                break;
            }   
            else if (score2>=55 && score2 <65){
                break;
            }
            else if (score2>=40 && score2 <55){
                break;
            }
            else if (score2<40 && score2 >=0){
                break;
            }
            else{
                System.out.print("Please enter a valid score for subject 2 : ");
                continue;
            }
        }

        System.out.print("Enter score in Subject 3 : ");
        while(true){
            score3 = sc.nextFloat();
            if(score3>=95&&score3<=100) {
                break;
            }
            else if (score3>=75 && score3 <95){
                break;
            }
            else if (score3>=65 && score3 <75){
                break;
            }   
            else if (score3>=55 && score3 <65){
                break;
            }
            else if (score3>=40 && score3 <55){
                break;
            }
            else if (score3<40 && score3 >=0){
                break;
            }
            else{
                System.out.print("Please enter a valid score for subject 3 : ");
                continue;
            }
        }

        System.out.print("Enter score in Subject 4 : ");
        while(true){
            score4 = sc.nextFloat();
            if(score4>=95&&score4<=100) {
                break;
            }
            else if (score4>=75 && score4 <95){
                break;
            }
            else if (score4>=65 && score4 <75){
                break;
            }   
            else if (score4>=55 && score4 <65){
                break;
            }
            else if (score2>=40 && score2 <55){
                break;
            }
            else if (score4<40 && score4 >=0){
                break;
            }
            else{
                System.out.print("Please enter a valid score for subject 4 : ");
                continue;
            }
        }

        System.out.print("Enter score in Subject 5 : ");
        while(true){
            score5 = sc.nextFloat();
            if(score5>=95&&score5<=100) {
                break;
            }
            else if (score5>=75 && score5 <95){
                break;
            }
            else if (score5>=65 && score5 <75){
                break;
            }   
            else if (score5>=55 && score5 <65){
                break;
            }
            else if (score5>=40 && score5 <55){
                break;
            }
            else if (score5<40 && score5 >=0){
                break;
            }
            else{
                System.out.print("Please enter a valid score for subject 5 : ");
                continue;
            }
        }

        percentage = (score1+score2+score3+score4+score5)/5;

        if (percentage>=40 && score1>=40 && score2>=40 && score3>=40 && score4>=40 && score5>=40){
            if(percentage>=95&&percentage<=100) {
                grade = "Outstanding";
            }
            else if (percentage>=75 && percentage <95){
                grade = "Excellent";
            }
            else if (percentage>=65 && percentage <75){
                grade = "A Grade";
            }   
            else if (percentage>=55 && percentage <65){
                grade = "B Grade";
            }
            else {
                grade = "C Grade";
            }
            result = "Successful";
            System.out.println("\n---------------------------------");
            System.out.println("Score card of the student is : ");
            System.out.println("---------------------------------");
            System.out.println("Name       : " +name);
            System.out.println("Gender     : " +gender);
            System.out.println("Department : " +dept);
            System.out.println("Year       : " +year);
            System.out.println("Section    : " +sec);
            System.out.println("Result     : " +result);
            System.out.println("---------------------------------");
            System.out.println("Subjectwise marks are as follows : ");
            System.out.println("Subject1   : " +score1);
            System.out.println("Subject2   : " +score2);
            System.out.println("Subject3   : " +score3);
            System.out.println("Subject4   : " +score4);
            System.out.println("Subject5   : " +score5);
            System.out.println("---------------------------------");
            System.out.println("Percentage : " +percentage);
            System.out.println("---------------------------------");
            System.out.println("Grade      : " +grade);
            System.out.println("---------------------------------");
        }
        else {
            grade = "Fail";
            result = "Unsuccessful";

            System.out.println("\n---------------------------------");
            System.out.println("Score card of the student is : ");
            System.out.println("---------------------------------");
            System.out.println("Name       : " +name);
            System.out.println("Department : " +dept);
            System.out.println("Year       : " +year);
            System.out.println("Section    : " +sec);
            System.out.println("Result     : " +result);
            System.out.println("Grade      : " +grade);
            System.out.println("---------------------------------");
            
        }

        
    }       
}

public class Main_17{
    public static void main(String[] args) {
        Grader s1 = new Grader();
        s1.letter_grade();
    }
}

    
