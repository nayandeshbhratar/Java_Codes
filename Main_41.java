/*
Construct an application to create a database for selling of a particular shop.
The prices of item are as follows :
456,662,962,538,971,41,109

Print the statistics as follows :
1) Print the sorted list of prices.
2) Print the total selling of the day.
3) Print the costliest item sold.
4) Print the cheapest item sold
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main_41 {
    public static void main(String[] args) {
        int prices;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> selling = new ArrayList<Integer>();

        for (int i =1;i<=7;i++){
            System.out.print("Enter prices : ");
            prices = sc.nextInt();
            selling.add(prices);
        }    

        Collections.sort(selling);
        System.out.println("Sorted list is : "+selling);


        int total = 0;
        /*for (int t=0;t<=6;t++){
            total = total + selling.get(t);
        }*/

        for(int t :selling){
            total = total + t;
        }

        System.out.println("Total selling is : "+total);


        System.out.println("Cheapest item price is : "+selling.get(0));

        System.out.println("Costliest item price is : "+selling.get(selling.size()-1));
    }
    
}
