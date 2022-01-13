package Dec_31_Oops_concepts;
class Box
{
	float width;
	float height;
	float depth;
	
	float calcvol() {
		return width*depth*height;
	}
	}


public class BoxDemo {

	public static void main(String[] args) {
		Box box1;
		box1=new Box();
		box1.width=5.6f;
		box1.height=6.7f;
		box1.depth=3.4f;
		float vol=box1.calcvol();
		System.out.println("volume of box1 is " +vol); 		
	
		{
		Box box2;
		box2=new Box();
		box2.width=4.66f;
		box2.height=6.7f;
		box2.depth=7.22f;
		float vol1=box2.calcvol();
		System.out.println("valume of box2 is " +vol1);
		}
	}

}

