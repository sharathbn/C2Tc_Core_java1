package Jan_5_Polymorphism;
public class Student {
	int usn;
	String name;
	String dept;
	int phno;
	
	public Student() {
	}
	
	public Student(int usn, String name, String dept, int phno) {
		super();
		this.usn = usn;
		this.name = name;
		this.dept = dept;
		this.phno = phno;
	}




	public Student(int usn, String name) {
		super();
		this.usn = usn;
		this.name = name;
	}


	public String toString() {
		String str="("+usn+","+name+","+dept+","+phno+")";
		return str;
	}


	public static void main(String[] args) {
		Student s1=new Student();{
			s1.usn=2312;
			s1.name="sharath";
			s1.dept="ise";
			s1.phno=68273827;
			System.out.println(s1.toString());
			
			Student s2=new Student(3,"hhgjh","cse",65289900);
			System.out.println(s2.toString());
			
			Student s3=new Student(345,"hgsshj");
			System.out.println(s3.toString());
			
			
			
		
		}
		

	}

}


