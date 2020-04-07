/**
 *  Purpose:  Create and store bank account info
 */

/**
 * @author Michael Joiner
 *
 */
public class Bankinfo {

	// Declare variables 
	public String name; 
	private double balance;
	public char type; 
	public double interestRate;
	public int accountNumber;
	
	// Build Constructor 
	public Bankinfo()
	{
	// Set the initial balance of account ]
		balance = 0;
	}
	
	// Deposit funds 
	public void addDeposit(double dep)
	{
		balance = balance + dep; 
	}
	
	// Withdrawls  funds 
		public void subtractWithdrawal (double wit)
		{
			balance = balance - wit; 
		}
		
	// Check balance 
		public double getBalance()
		{
			return balance;
			
		}
		
		
		
		
		
		