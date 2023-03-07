package Bank_management;



	public class InvalidBankTransaction extends Exception
	{
	     String errorMessage;
	     public InvalidBankTransaction(String message)
	     {
	        errorMessage = message;
	     }  
	      public String getMessage()
	      {
	          return errorMessage;
	      }
	}


