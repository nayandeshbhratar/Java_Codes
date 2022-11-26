// Hotel

import java.util.Scanner;
class OnlineFood{
    int item_number; 
    double bill,discount;
    String choice;
    Scanner sc = new Scanner(System.in);

    void menu(){
        System.out.println("\n----------------------- Menu of Hotel is -----------------------\n ");
        System.out.println(" Item number \t| Item name \t\t\t\t | Price\t\t");
        System.out.println(" 1. \t\t| Howzatt Biryani Combo  \t\t | 725 /-  ");
        System.out.println(" 2. \t\t| Super 6s Bucket meal   \t\t | 978 /-  ");
        System.out.println(" 3. \t\t| Super 4s Bucket meal   \t\t | 608 /-  ");
        System.out.println(" 4. \t\t| 5pc Smoky Red Chicken  \t\t | 524 /-  ");
        System.out.println(" 5. \t\t| Classic Biryani Combo  \t\t | 777 /-  ");
        System.out.println(" 6. \t\t| Tandoori Zinger Burger \t\t | 209 /-  ");
        System.out.println(" 7. \t\t| Cold Drink             \t\t | 040 /-  ");
        System.out.println(" 8. \t\t| Classic Zinger meal    \t\t | 362 /-  ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println(" 9. \t\t| Exit and get bill      \t\t           ");
    }

    void order(){
        System.out.print("\nEnter the item number you want to order : ");
        item_number= sc.nextInt();

        if (item_number==1) {
            bill = bill+725;
            System.out.println("You ordered Howzatt Biryani Combo worth 725/-");
        }
        else if (item_number==2){
            bill = bill+978;
            System.out.println("You ordered Super 6s Bucket meal worth 978/-");
        }
        else if (item_number==3){
            bill = bill+608;
            System.out.println("You ordered Super 4s Bucket meal worth 608/-");
        }
        else if (item_number==4){
            bill = bill+524;
            System.out.println("You ordered 5pc Smoky Red Chicken worth 524/-");
        }
        else if (item_number==5){           
            bill = bill+777;
            System.out.println("You ordered Classic Biryani Combo worth 777/-");
        }
        else if (item_number==6){
            bill = bill+209;
            System.out.println("You ordered Tandoori Zinger Burger worth 209/-");
        }
        else if (item_number==7){
            bill = bill+40;
            System.out.println("You ordered Cold Drink worth 40/-");
        }
        else if (item_number==8){
            bill = bill+362;
            System.out.println("You ordered Classic Zinger meal worth 362/-");
        }
        else if (item_number == 9){
            if (bill> 100 && bill<500){
                discount = 0.1*bill;
            }
            else if (bill>500 && bill <1000){
            discount = 0.15*bill;
            }
            else if(bill>1000){ 
            discount=0.20*bill;
            }
            else{
            discount=0;
            }
            System.out.println("Your bill is (including gst and discount) : "+ ((bill-discount)+(0.18*bill)));  //gst is 18%
            System.out.println("Thank You ;), Visit again ..........................");

            System.exit(0);
        }
        else {
            System.out.println("Enter valid item number\n");
        }
    }

}
public class Main_25 {
    public static void main(String[] args) {
        OnlineFood f1 = new OnlineFood();
        Scanner myObj = new Scanner(System.in);
        String choice = "Y";
        while(choice=="Y"){
            f1.menu();
            f1.order();
        }
    }
}
