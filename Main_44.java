// Sets (Have only unique item)

import java.util.HashSet;
import java.util.Scanner;

public class Main_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> mySet = new HashSet<Integer>();

        System.out.print("Enter number of Students whose PRN number you want to enter : ");
        int students = sc.nextInt();

        for (int i =1;i<=students;i++){
            System.out.print("Enter PRN Number : ");
            int prn_number = sc.nextInt();
            mySet.add(prn_number);
        }

        System.out.println(mySet);

        System.out.print("Enter the number you want to search in the HashSet : ");
        int itemNumber = sc.nextInt();

        int flag =0;

        for (int i: mySet){
            if(itemNumber == i){
                flag = 1;
                break;
            }
            else{
                continue;
            }
        }

        if(flag==1){
            System.out.println("Item is available in the linked list ");
        }
        else{
            System.out.println("Item not found in the linked list ");
        }
        
        
    }
}
