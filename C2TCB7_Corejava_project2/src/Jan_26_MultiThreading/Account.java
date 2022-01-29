package Jan_26_MultiThreading;

import java.util.Scanner;

public class Account {

	static int Balance=10000;
	public static void main(String[] args) {
		AClass oa=new AClass();
		
		
		DepositThread dt1=new DepositThread(oa, 5000,"First");
		DepositThread dt2=new DepositThread(oa, 4000,"Second");
		WithdrawThread wt1=new WithdrawThread(oa,1000,"third");
		WithdrawThread wt2=new WithdrawThread(oa,100,"fourth");
		System.out.println("Enter your choice");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if (choice==1) {
			dt1.start();
			dt2.start();
			wt2.start();
			try
	        {
	        dt1.join();
	        dt2.join();
	        }
	        catch(Exception e)
	        {
	        }
	}
			else {
				wt1.start();
				wt2.start();
				try
		        {
		        wt1.join();
		        wt2.join();
		        }
		        catch(Exception e)
		        {
		        }
			
		}
		System.out.println("Total balance is: "+Balance);
	}

}
