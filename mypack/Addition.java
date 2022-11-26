package mypack;
import java.util.Scanner;
public class Addition {
    int num1,num2;
    public Addition(int num_1,int num_2){
        num1 = num_1;
        num2 = num_2;
    }
    
    public void displayDetails(){
        System.out.println("Addition is : "+(num1+num2));
    }
}
