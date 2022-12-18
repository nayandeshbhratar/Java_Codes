// Linked List
import java.util.LinkedList;
import java.util.Scanner;

public class Main_43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        LinkedList<Integer> myList = new LinkedList<Integer>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
        myList.add(70);
        myList.add(60);

        for (int i =0;i<=myList.size()-1;i++){
            count+=1;
        }

        System.out.println("Number of elements in the Linked List is : "+count);

        System.out.print("Enter the number you want to search in the linked list  : ");

        int itemNumber = sc.nextInt();
        int flag =0;

        for (int i =0; i<=myList.size()-1;i++){
            if(itemNumber == myList.get(i)){
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
