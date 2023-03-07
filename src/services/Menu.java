package services;

import java.util.Scanner;

import bean.Bank_System;
public class Menu {
	int Choice;
    Bank_System banking = new Bank_System();
    public void Display()
    {
        System.out.println("###Main Menu###");
        System.out.println("Press # 1 : Deposit Amount.");
        System.out.println("Press # 2 : Withdraw Amount.");
        System.out.println("Press # 3 : Cheak Balance");
        System.out.println("Press any key for Exit the Window");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter Your Choice:");
        Choice = scanner.nextInt();
        switch (Choice) {
            case 1:
                 Deposit_Money d = new Deposit_Money();
                 int depamt =  d.userInput();
                 banking.add(depamt);
                 Display();
                break;
            case 2:
                 System.out.println("Please Enter the amount to withdraw:");
                 int withamt=scanner.nextInt();
                 banking.withdrw(withamt);
                 Display();
                break;
            case 3:
                  System.out.println("Your Account Balance is "+banking.getBalance()+" Rupees");
                  System.out.println(" ");  
                  Display();
                break;
        
            default:
                  System.out.println("***THank You Visit Again***");
                  System.exit(0);
                break;
        }
        
    }
}
