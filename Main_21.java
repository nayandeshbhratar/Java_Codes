/*
Construct a program to print the grade of the steel depending on the following criteria :
1) Hardness > 50
2) Carbon Content < 0.7
3) Tensile Strength > 5.6

The grade of the steel is categorized as :
a) If all the above conditions met, Grade is A
b) If first two conditions met, Grade is B
c) If only one condition met, Grade is C
d) If first and third conditions met, Grade is D
e) If none of the conditions are met, Grade is E
*/

import java.util.Scanner;
class Grade{
    float hardness,carbon_content,tensile_strength;
    Grade(float hardness1,float carbon_content1,float tensile_strength1){
        hardness = hardness1;
        carbon_content = carbon_content1;
        tensile_strength = tensile_strength1;
    }

    void testGrade(){
        if (hardness > 50 && carbon_content <0.7 && tensile_strength>5.6){
            System.out.println("Grade of the steel is A");
        }
        else if (hardness > 50 && carbon_content <0.7){
            System.out.println("Grade of the steel is B");
        }
        else if (hardness > 50 || carbon_content <0.7 || tensile_strength>5.6){
            System.out.println("Grade of the steel is C");
        }
        else if(hardness > 50 && tensile_strength>5.6){
            System.out.println("Grade of the steel is D");
        }
        else {
            System.out.println("Grade of the steel is E");
        }
    }

}

public class Main_21 {
    public static void main(String[] args) {
        float hardness2,carbon_content2,tensile_strength2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hardness : ");
        hardness2 = sc.nextFloat();
        System.out.println("Enter Carbon Content : ");
        carbon_content2 = sc.nextFloat();
        System.out.println("Enter Tensile Strength : ");
        tensile_strength2 = sc.nextFloat();
        Grade g1 = new Grade(hardness2, carbon_content2, tensile_strength2);
        g1.testGrade();
    }
}
