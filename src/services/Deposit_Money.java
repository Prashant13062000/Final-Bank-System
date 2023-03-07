package services;
import Bank_management.InvalidBankTransaction;
import java.util.Scanner;
public class Deposit_Money {
int amt= 0;
    
    public int userInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposited Ammount: ");
        amt = scanner.nextInt();
        if(amt<=0)
        {
            InvalidBankTransaction depositnegativeError = new InvalidBankTransaction("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInput();
           
        }else{   
            return amt;
        }
        return amt;
        
    }

}
