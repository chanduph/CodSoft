import java.util.Scanner;
public class Atm 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int balance = 5000000, withdraw, deposit;   
		while(true)  
		{  
			System.out.println("Automated Teller Machine");  
			System.out.println("Choose 1 for Withdraw");  
			System.out.println("Choose 2 for Deposit");  
			System.out.println("Choose 3 for Check Balance");  
			System.out.println("Choose 4 for EXIT");  
			System.out.print("Choose any operation you want to perform:");   	
			int choice = input.nextInt();  
			switch(choice)  
        {  
            case 1:  
            	System.out.print("Enter money to be withdrawn:");
            	withdraw = input.nextInt();  
            	
            	if(balance>=withdraw)  
            	{  
                  	balance = balance - withdraw;  //remove the withdraw amount from the total balance  
            		System.out.println("Please Collect your money");  
            	}  
            	else  
            	{  
            		System.out.println("Insufficient Balance");  
            	}  
            	System.out.println("\n");  
            	break;  
            	case 2:                   
            		System.out.print("Enter money to be deposited:");  
            		deposit = input.nextInt();  
            		balance = balance + deposit;  //add the deposit amount to the total balance  
            		System.out.println("Your Money has been successfully depsited");  
            		System.out.println("\n");  
            		break;  
            	case 3:  
            		//display total balance 
            		System.out.println("Balance:"+balance);
            		System.out.println("\n");
            		break;  
            	case 4: 
            		System.exit(0);  
        	}  
		}  
	}  
}  

