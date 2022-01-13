package Dec_30_Satic_Variables;
public class VariablesDemo1 {
	//class or instance variable
	final static int a=1024;
	int b;
	
	void func1() {
		final int c;
		c=10;
		System.out.println("Class variables " + a +" "+ b);
		System.out.println("local variables " +c);
		//a=7890;
		b=56;
		System.out.println("Class variables " + a +" "+b);
	}
	void func2() {
		System.out.println("Class variables " + a +" "+b);
	}
	public static void main(String[] args) {
		VariablesDemo1 obj=new VariablesDemo1();
		System.out.println(obj.b);
		System.out.println(VariablesDemo1.a);
	}

}

