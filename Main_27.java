/* 
1) Construct a program to implement the following inheritance path :
   Student --> Marks --> Result 
2) Create a class Incentive marks and add it to above inheritance path.
3) Create another class sports marks and add it to above inheritance path.
*/

import java.util.Scanner;

class Student{
  String name, roll_number,dept,year;
  Student(String name1, String roll_number1, String dept1, String year1){
    name = name1;
    roll_number = roll_number1;
    dept = dept1;
    year = year1;
  }
  void displayDetails(){
    System.out.println("Name         : "+name);
    System.out.println("Roll Number  : "+roll_number);
    System.out.println("Department   : "+dept );
    System.out.println("Year         : "+year );
  } 
}

class Marks extends Student{
  double java, ac,mnm, ac_prac, mnm_prac, pe,oe;
  Marks(String name1, String roll_number1, String dept1, String year1, double java1,double ac1, double mnm1, double ac_prac1, double mnm_prac1, double pe1, double oe1) {
    super(name1, roll_number1,dept1,year1);
    java = java1;
    ac = ac1;
    mnm = mnm1;
    ac_prac = ac_prac1;
    mnm_prac = mnm_prac1;
    pe = pe1;
    oe = oe1;
  }  
  void displayMarks(){
    System.out.println("Java     : "+java);
    System.out.println("AC       : "+ac);
    System.out.println("MNM      : "+mnm);
    System.out.println("Prog Elec: "+pe);
    System.out.println("OE       : "+oe);
    System.out.println("MNM Prac : "+mnm_prac);
    System.out.println("AC Prac  : "+ac_prac);
  }
}

class Incentives extends Marks{
    double incentives;
    Incentives(String name1, String roll_number1, String dept1, String year1, double java1,double ac1, double mnm1, double ac_prac1, double mnm_prac1, double dip1, double oe1,double incentives1){
        super(name1, roll_number1,dept1,year1,java1,ac1,mnm1,ac_prac1,mnm_prac1,dip1,oe1);
        incentives = incentives1;
    }
    void displayIncentives(){
      System.out.println("Incentives : "+incentives);
    }
}

class sportsMarks extends Incentives{
  double sports_marks;
  sportsMarks(String name1, String roll_number1, String dept1, String year1, double java1,double ac1, double mnm1, double ac_prac1, double mnm_prac1, double dip1, double oe1,double incentives1,double sports_marks1){
    super(name1, roll_number1,dept1,year1,java1,ac1,mnm1,ac_prac1,mnm_prac1,dip1,oe1,incentives1);
    sports_marks = sports_marks1;
  }
  void displaySportsMarks(){
    System.out.println("Sports Marks : "+sports_marks);
  }
}

class Result extends sportsMarks{
  double total_marks, percentage, sgpa;
  Result(String name1, String roll_number1, String dept1, String year1, double java1,double ac1, double mnm1, double ac_prac1, double mnm_prac1, double dip1, double oe1,double incentives1,double sports_marks1,double total_marks1, double percentage1, double sgpa1){
    super(name1, roll_number1,dept1,year1,java1,ac1,mnm1,ac_prac1,mnm_prac1,dip1,oe1,incentives1,sports_marks1);
    total_marks = total_marks1;
    percentage = percentage1;
    sgpa = sgpa1;
  }
  void displayResult(){
    System.out.println("Total Marks : "+total_marks);
    System.out.println("Percentage  : "+percentage);
    System.out.println("SGPA        : "+sgpa);
  }
}

public class Main_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name2,roll_number2,dept2,year2;
        double java2, ac2,mnm2, ac_prac2, mnm_prac2, pe2,oe2,incentives2,sports_marks2,total_marks2, percentage2, sgpa2;
        System.out.print("Enter name of the student : ");
        name2 = sc.nextLine();
        System.out.print("Enter roll number of the student : ");
        roll_number2 = sc.nextLine();
        System.out.print("Enter department of the student : ");
        dept2= sc.nextLine();
        System.out.print("Enter year of Studying : ");
        year2 = sc.nextLine();
        System.out.print("Enter marks in Java : ");
        java2 = sc.nextDouble();
        System.out.print("Enter marks in AC : ");
        ac2 = sc.nextDouble();
        System.out.print("Enter marks in MNM : ");
        mnm2 = sc.nextDouble();
        System.out.print("Enter marks in AC Practical : ");
        ac_prac2 = sc.nextDouble();
        System.out.print("Enter marks in MNM Practical : ");
        mnm_prac2 = sc.nextDouble();
        System.out.print("Enter marks in Program Elective : ");
        pe2 = sc.nextDouble();
        System.out.print("Enter marks in Open Elective : ");
        oe2 = sc.nextDouble();
        System.out.print("Enter Incentives Marks2 : ");
        incentives2 = sc.nextDouble();
        System.out.print("Enter sports marks : ");
        sports_marks2 =sc.nextDouble();
        total_marks2 = (java2+ac2+mnm2+ac_prac2+mnm_prac2+pe2+oe2+incentives2+sports_marks2);
        percentage2 = total_marks2/9;
        sgpa2 = percentage2/9.25;
    
        Result r1 = new Result(name2,roll_number2,dept2,year2,java2,ac2,mnm2,ac_prac2,mnm_prac2,pe2,oe2,incentives2,sports_marks2,total_marks2,percentage2,sgpa2);
        r1.displayDetails();
        r1.displayMarks();
        r1.displayIncentives();
        r1.displaySportsMarks();
        r1.displayResult();
      }
}
