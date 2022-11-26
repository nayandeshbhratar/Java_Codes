// Practical 02

import java.util.Scanner;
class Commission{
    float sales;

    Commission(float sales1){ // parameterized constructor
        sales = sales1;
    }
    
    void commission(){
        if (sales>=50000){
            System.out.println("Commission is = "+ 0.2*sales);
        }
        else if (sales>=40000 && sales<50000){
            System.out.println("Commission is = "+ 0.15*sales);
        }
        else if (sales>=30000 && sales<40000){
            System.out.println("Commission is = "+ 0.10*sales);
        }
        else if (sales>=20000 && sales<30000){
            System.out.println("Commission is = "+ 0.07*sales);
        }
        else if (sales>=10000 && sales<20000){
            System.out.println("Commission is = "+ 0.05*sales);
        }
        else if(sales>=5000 && sales<10000){
            System.out.println("Commission is = "+0.02*sales);
        }
        else if(sales>=0 && sales<5000){
            System.out.println("Commission is = "+0);
        }
    }
}

public class Main_19 {
    public static void main(String[] args) {
        float sales2;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Sales : ");
            sales2 = sc.nextFloat();
            if (sales2 < 0){
                System.out.println("The amount you entered is invalid");
                continue;
            }
            else{
                Commission c1 = new Commission(sales2);
                c1.commission();  
                break;
            }
        }
    }
}
