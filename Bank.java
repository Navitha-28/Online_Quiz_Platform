import java.io.*;
import java.util.*;

public class Bank
{
    public static Scanner sc = new Scanner(System.in);
    public static double balance=0;
    public static int ch;
    public static void main(String[] args)
    {
        do
        {
            System.out.println("1.Deposit\n"+"2.withdraw\n"+"3.check balance\n"+"4.exit\n");
            System.out.print("Enter your Choice: \n");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkbalance();
                    break;
                case 4:
                    System.out.println("Exiting...\n");
                    break;
                default:
                    System.out.println("Invalid choice,please try again");
                
            }
    
        }while(ch!=4);
    }
        
    private static void deposit()
    {
        System.out.println("Enter amount to deposit: ");
        double amount=sc.nextDouble();
        balance+=amount;
        System.out.println("deposit of $" + amount + " succussful\n");
    }

    private static void withdraw()
    {
        System.out.println("Enter amount to withdraw: ");
        double amount=sc.nextDouble();
        if(amount <= balance)
        {
            balance-=amount;
            System.out.println("withdraw of $" + amount + "successful\n");
        }
        else
        {
            System.out.println("inefficient balance. withdraw failed\n");
        }
    }

    private static void checkbalance()
    {
        System.out.println("your current balance is: $" + balance +"\n");
    }
}