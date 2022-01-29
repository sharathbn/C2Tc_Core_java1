package Jan_26_MultiThreading;

public class WithdrawThread extends Thread {
	AClass obj;
	int amt;
	String msg;
	
	public WithdrawThread(AClass obj, int amt,String msg) {	
		this.obj = obj;
		this.amt = amt;
		this.msg=msg;
	}

	@Override
	public void run() {
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		//System.out.println("Second");
		obj.withdraw(amt);
		
	}
	

}