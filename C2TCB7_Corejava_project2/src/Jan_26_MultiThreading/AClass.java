package Jan_26_MultiThreading;

public class AClass {
	int bal;
	
synchronized void deposit(int amt)
{
	
	System.out.println("Getting balance...");
	int oldbal=getBalance();
	bal=oldbal+amt;
	//setBalance(bal);
}


	//Account.Balance=amt;
synchronized void withdraw(int amt) {
	System.out.println("Getting Balance...");
	int oldbal=getBalance();
	if(amt>oldbal)
	{
		System.out.println("InsufficientBalance!");
	}
	else {
		bal=oldbal-amt;
	}
	//setBalance(bal);
	}
int getBalance()
	{
		return Account.Balance;
	}
//void setBalance1(int amt)
{
	try
	{
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		
	}
	
}

}
