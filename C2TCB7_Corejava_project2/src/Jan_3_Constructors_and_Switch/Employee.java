package Jan_3_Constructors_and_Switch;
public class  Employee {
	int id;
	String name;
	String email;
	Float salary;
	public Employee()
	{
	}

		
		
	public Employee(int id, String name, String email, Float salary) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}



	public Employee(int id) {
		
		this.id = id;
	}
public String toString() {
	String str="(" +id+ "," +name+ "," +email+ "," +salary+ ")";
	return str;
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=2;
		e1.name="ddddd";
		e1.email="bjhj";
		e1.salary=577f;
		System.out.println(e1.toString());
		
		
		Employee e2=new Employee(1,"sharath","shdjks",200f);
		System.out.println(e2.toString());
		Employee e3=new Employee(399);
		System.out.println(e3.toString());

	}

}

