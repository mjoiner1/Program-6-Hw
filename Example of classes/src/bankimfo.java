

import java.util.Scanner; 

public class bankAccount {

	public static void main(String[] args) {
	//TODO Auto-generated method stub 
		
		// Declare our variables 
		Scanner keyboard = new Scanner (System.in);
		double deposit = 0;
		double withdrawal = 0;
		
		// Create a Checking account of Bankccount 
		BankAccount checking = new BankAccount ();
				// What this creates: 
				// checking.name  or checking.accountNumber
		checking.name = "Mike's Primary Checking";
		checking.accountNumber = 85914;
		checking.type = 'C'; 
		
		// Lets set the initial balance 
		// checking.balance = (200..00) ;
		// i CANNONT do this because balance is PRIVATE 
		checking.addDeposit (200.00);
		System.out.println("Your starting balace is : $" + checking.getBalance());
		
		//Make deposit 
		System.out.print("How much would you like to deposit");
		deposit = keyboard.nextDouble();
		checking.addDeposit(deposit);
		
		
		//Make Withdrawal 
				System.out.print("How much would you like to withdrawal?");
				deposit = keyboard.nextDouble();
				checking.addDeposit(deposit);
		
		}
	
