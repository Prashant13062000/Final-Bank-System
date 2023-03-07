package bean;
import Bank_management.InvalidBankTransaction;
import services.Login;

public class Bank_System {
	
	
	    int amount = 0;
	    public void initiate()
	    {
	        Login login = new Login();
	        try{
	            login.acceptInput();
	            login.verify();
	            
	        }catch(Exception e)
	        {
	            try{
	                login.acceptInput();
	                login.verify();
	                
	            }catch(Exception f)
	            {
	               
	             }
	        }
	    }
	    public int getBalance(){
	    	System.out.println("Your Balance Is "+amount);
	        return amount;
	    }
	    public void add(int amt){
	        amount = amount + amt;
	        System.out.println("Amount deposited Successfully");
	        System.out.println(" ");
	        System.out.println("Total Balance: " +amount);
	        System.out.println(" ");
	    }
	    public void withdrw(int amt){
	        System.out.println(" ");
	        if(amount < amt)
	        {
	            InvalidBankTransaction invalidWithDraw = new InvalidBankTransaction("InValid Amount to Withdrow Enter Valid Ammount(Insufficient Balance)");
	            System.out.println(invalidWithDraw.getMessage());
	        }else{
	            amount = (amount - amt);
	            System.out.println("Please Collect your " + amt +" Rupees");
	            System.out.println(" ");
	            System.out.println("Total Balance: " +amount);
	            System.out.println(" ");
	        }
	        if (amount==0)
	        {
	        	System.out.println("-> -> plz add minimun balance yo maintain your account");
	        }
	    }

}
