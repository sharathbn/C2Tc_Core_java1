package Dec_28_Variables;
public class VariablesDemo {
	//class variable
	int a=1024;
	int b;
	
	void func1() {
		int c;
		c=10;
		System.out.println("Class variables " + a +" "+ b);
		System.out.println("local variables " +c);
		a=7890;
		b=56;
		System.out.println("Class variables " + a +" "+b);
	}
	void func2() {
		System.out.println("Class variables " + a +" "+b);
	}
	public static void main(String[] args) {
		VariablesDemo obj=new VariablesDemo();
		obj.func1();
		obj.func2();
	}

}

