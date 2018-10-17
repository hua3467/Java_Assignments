/**
 *
 * @author zhenhua.yang.1
 */
public class BankAccountTest 
{
    public static void main( String [] args )
    {
        // Create a BankAccount object using the default constructor
        BankAccount account1 = new BankAccount();
        
        // print the current balance
        System.out.println( "The initial balance of account1 is " + account1.getBalance() );
        
        // deposit 1000 dollars into account1
        account1.deposit( 1000.0 );
        // Print the current balance of account1
        System.out.println( "After depositing $1000,the current balance of account1 is " + account1.getBalance() );
        
        // Withdraw 250 dollars from account1 
        account1.withdraw(250.0);
        
        // print the new balance
        System.out.println( "After withdraing $250, the balance of account1 is " + account1.getBalance() );
        
        // Create the second BankAccount object:
        BankAccount account2 = new BankAccount( 500.0 );
        
        // print current balance of account2
        System.out.println( "The initial balance of account2 is " + account2.getBalance());
        
        // Try withdrawing 550 dollars from account2
        //account2.withdraw(550.0);
        // line 33 would throw IllegalArgumentException error, 
        //becaue current balance is smaller than entered value. 
        
        // correct the line 33:
        account2.withdraw(100.0);
        
        // assign account1 to account2
        account2 = account1;
        
        // Deposit 50 dollars into account1.
        account1.deposit(50.0);
        
        // Print the current balance of both account1 and account2 
        System.out.println( "The current balance of account1 is " + account2.getBalance()
                    + " and the current balance of account2 is " + account1.getBalance());
    }
}
