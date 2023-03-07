package services;


import java.util.Scanner;

import Bank_management.InvalidBankTransaction;
import bean.Bank_System;

public class Login {
	Scanner sc = new Scanner(System.in);
    int ch;
	int ac_number;
    int ac_pass;
    int ac;
    int pw;
    public void acceptInput(){	
    	System.out.println("Creat Account");
    	
    	
    	do
    	{
    		
        System.out.println("Enter Account Number");
        ac_number=sc.nextInt();
        System.out.println("Creat 5 Digit Code");
        ac_pass=sc.nextInt();
        
        
        
        if(ac_pass>9999 && ac_pass<=99999)
        {
        	System.out.println("Account Created Succesfully");
        }
        else
        {
        	System.out.println("Try Again");
        }
    	}
        while(ac_pass<=9999);
    	
        
        
        
   
        System.out.println("Enter 1 To login");
        ch=sc.nextInt();
        if(ch==1) {
        System.out.println("Enter the account number:");
        ac = sc.nextInt();
        System.out.println("Enter the Password:");
        pw = sc.nextInt();
        }
        else {
        	System.out.println("Sorry");
        }
    	}
    public void verify() throws Exception{
         
        if(ac == ac_number && pw == ac_pass)
        {
            System.out.println("Login Successfull");
            Bank_System banking = new Bank_System();
            System.out.println(" ");
            System.out.println("Your Balance is: "+banking.getBalance()+"$$ In Rupees");
            System.out.println(" ");
            Menu menu = new Menu();
            menu.Display();
        }else{
            InvalidBankTransaction loginfailed = new InvalidBankTransaction("Incorrect login Detail plz Try Again");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;
        }
    }

}
