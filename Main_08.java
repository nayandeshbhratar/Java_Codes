// Write a program to print first 10 terms of fibonacci series

public class Main_08 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.println("The first ten terms of fibonacci series are : ");
        for (int i =1; i <11;i++){
            System.out.println(num1);
            int next_num = num1+num2;
            num2 = num1;
            num1 = next_num;

        }
    }
}
