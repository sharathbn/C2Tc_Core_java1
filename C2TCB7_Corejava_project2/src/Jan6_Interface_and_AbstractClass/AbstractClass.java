package Jan6_Interface_and_AbstractClass;
abstract class GraphicObject
{
	int x, y;
	void moveTo(int newX, int newY)
	{
		this.x=newX;
		this.y=newY;
	}
	abstract void draw();
	abstract void resize();	
}
class Rectangle extends GraphicObject
{
	void show()
	{
		
	}

	@Override
	void draw() {
		
	}

	@Override
	void resize() {
			
	}
}

class Circle extends GraphicObject
{
	@Override
	void draw() {
		
	}

	@Override
	void resize() {
		
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		//GraphicObject obj=new GraphicObject();
		Rectangle obj1=new Rectangle();
		obj1.show();

	}

}
