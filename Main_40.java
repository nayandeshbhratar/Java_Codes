// Collections

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main_40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> student = new ArrayList<>();
        String name;
        for(int i=1; i <=5;i++){
            System.out.print("Enter name "+i+" : ");
            name = sc.nextLine();
            student.add(name); // Adding elements in array 
        }

        // Printing Array
        System.out.println("Array is : "+student);

        // Getting size of list
        System.out.println("Size of list is : "+(student.size())); 

        // Accessing Element of Array by index
        System.out.println("Accessed element is : "+student.get(0)); 

        // Updating Element of list by index
        student.set(0,"John");
        System.out.println("Updated list is : "+student);

        // Removing element by index
        student.remove(2);   
        System.out.println("Array after removing element is : "+student);

        // Sorting the list
        Collections.sort(student);  
        System.out.println("Sorted list is : "+student);

        // clearing the list
        student.clear();  
        System.out.println("List is cleared..." + student);
    }
}