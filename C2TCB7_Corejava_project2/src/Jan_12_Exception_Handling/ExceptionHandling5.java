package Jan_12_Exception_Handling;
import java.io.IOException;

public class ExceptionHandling5 {
	void m()throws IOException
	{
	throw new IOException("device error");//checked exception
	}
	void n()throws IOException
	{
	m();
	}
	void p()
	{
	try
	{
	n();
	}
	catch(Exception e){System.out.println("exception handled");}
	}
	public static void main(String args[])
	{
  ExceptionHandling5 obj=new ExceptionHandling5();
	obj.p();
	System.out.println("normal flow...");
	}

}



