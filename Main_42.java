/*
Construct a database of vehicles being parked in a parking lot during one week.
Vehicle numbers are as follows :
1234,4321,8976,1234,4321,1234,1234

Determine the mostly parked vehicle in the parking lot.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main_42 {
    public static void main(String[] args) {
        int vehicleNum;
        int maxcount = 0;
        int element_having_max_occurence = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> vehicleList = new ArrayList<Integer>();
        for (int i =1;i<=7;i++){
            System.out.print("Enter Vehicle Number : ");
            vehicleNum = sc.nextInt();
            vehicleList.add(vehicleNum);
        } 

        System.out.println("List of vehicle number is : "+vehicleList);

        for (int i = 0; i < 7; i++) {
            int count = 0;
            for (int j = 0; j < 7; j++) {
                if (vehicleList.get(i) == vehicleList.get(j)) {
                    count++;
                }
            }
 
            if (count > maxcount) {
            maxcount = count;
            element_having_max_occurence = vehicleList.get(i);
            }
        }
    
        System.out.println("The vehicle number of mostly parked vehicle in the parking lot is : "+element_having_max_occurence);
    }  
}
