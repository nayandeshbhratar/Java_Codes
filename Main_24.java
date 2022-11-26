/*
Construct a mini application for a Bank as per following requirement :
1) A mechanism to create a Bank account 
2) A method to display the details of account such as Account holder name, account number , current balance etc.
3) A method to deposit the amount 
4) A method to withdraw the required amount 
*/

import java.util.Scanner;
class Account{
    String name;
    int acc_no;
    int balance;

    void create(String nam, int acc, int amount){
        name = nam;
        acc_no = acc;
        balance = amount;
        System.out.println("\n Account Created Successfuly\n");
    }

    void display(){
    System.out.println("\n Account Details are as follows\n");
    System.out.println("\n Account Holder\t:"+name);
    System.out.println("\n Account Number\t:"+acc_no);
    System.out.println("\n Current Balance\t:"+balance);
    }
 
    void deposit(int amt){
    balance = balance + amt;
    System.out.println("\n Amount Deposited\t:"+amt);
    System.out.println("\n Current Balance\t:" +balance);
    }

    void withdraw(int amt){
        if(amt > balance){
        System.out.println("\n Can't Withdraw...Low Balance\n");
        }
        else{
        balance = balance - amt;
        System.out.println("\n Amount Withdraw \t:"+amt);
        System.out.println("\n Current Balance\t:"+balance);
        }
    }
}

public class Main_24{
    public static void main(String args[]){
        Account A1 = new Account();
        Scanner sc = new Scanner(System.in);

        int  input;
        String choice = "Y";

        while(choice == "Y"){
            System.out.println("Press 1 to create account");
            System.out.println("Press 2 to display account details ");
            System.out.println("Press 3 to Deposit amount");
            System.out.println("Press 4 to withdraw amount");
            System.out.println("Press 5 to exit");
            System.out.println("Enter your choice : ");
            input = sc.nextInt();
            
            switch(input){
            case 1:
            System.out.println("\n Enter the Account holder Name\n");
            String n = sc.nextLine();
            System.out.println("\n Enter the Account Number\n");
            int num = sc.nextInt();
            System.out.println("\n Enter the Opening Amount\n");
            int amount = sc.nextInt();
            A1.create(n, num, amount);
            break;

            case 2:
            A1.display();
            break;

            case 3 :
            System.out.println("\n Enter the Amount to Deposit\n");
            int amt = sc.nextInt();
            A1.deposit(amt);
            break;

            case 4:
            System.out.println("\n Enter the Amount to Withdraw\n");
            int a = sc.nextInt();
            A1.withdraw(a);
            break;

            case 5:
            System.exit(0);

            default :
            System.out.println("Enter a valid input ");
            }
        }
    }
}
