package Dec_31_Oops_concepts;
class Animal {
	int legs;
	String name;
	String color;

	public Animal() {
		System.out.println("this is default constructor");
	}

	public Animal(String name) {
		this();
		this.name = name;
	}

	public Animal(String name, String color) {
		this(name);
		this.color = color;
	}

	public Animal(int legs, String name, String color) {
		this(name, color);
		this.legs = legs;
	}

	void display() {
		System.out.println("animal description:");
		System.out.println(color + " " + "color" + name + " " + "with" + " " + legs + " " + "legs");

	}
}

public class ThisDemo {

	public static void main(String[] args) {
		Animal obj1 = new Animal(4, "cat", "white");
		obj1.display();
		Animal obj2 = new Animal("Dog", "Black");
		obj2.display();

	}

}


