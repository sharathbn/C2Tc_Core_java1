package Jan_5_Polymorphism;
class Bank{
	
	float getRateOfInterest(){
		return 6.7f;
	}
	
}
class SBI extends Bank{
	
	float getRateOfInterest(){
		return 6.9f;
	}
	
}
class HDFC extends Bank{
	
	float getRateOfInterest(){
		return 7.0f;
	}
	
}
class ICICI extends Bank{
	
	float getRateOfInterest(){
		return 9.7f;
	}
	
}




public class MethodOveridingDemo {

	public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println(obj.getRateOfInterest());
		
		Bank obj1=new SBI();
		System.out.println(obj1.getRateOfInterest());
		
		
		

	}

}
