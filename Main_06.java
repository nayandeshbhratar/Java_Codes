/*
Construct a program to calculate the profit or loss incurred in selling materials of a building 
supply shop with the following criteria :
1) the selling should be calculated from quantity of items and prices per item.
2) compare the selling price with actual price and determine the profit or loss.
*/

public class Main_06 {
    public static void main(String[] args) {
        int quantity = 10;
        int actual_price = 80;
        int selling_price = 100;
        int selling = selling_price * quantity;
        System.out.println("The selling is  :"+selling+" rs");
        if (selling_price > actual_price){
            System.out.println("Profit of " +(selling_price - actual_price) + " rs per item");
        }
        else if (selling_price < actual_price) {
            System.out.println("Loss of " +(actual_price-selling_price ) + " rs per item");
        }
        else {
            System.out.println("Neither profit nor loss");
        }
    }
}
