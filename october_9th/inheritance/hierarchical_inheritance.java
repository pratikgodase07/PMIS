//hierarchical inheritance
package october_9th.inheritance;

//common parent
class Shape
{
	String color="violet";
	
}

//child-1 
class Circle extends Shape
{
	void drawCircle()
	{
		System.out.println("Drawing a " + color + " circle");
	}
}


//child-2
class Rectangle extends Shape
{
	void drawRectangle()
	{
		System.out.println("Drawing a  " + color +" rectangle");
	}
}

public class hierarchical_inheritance 
{
	public static void main(String[] args) 
	{
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		
		c.drawCircle();
		r.drawRectangle();
	}

}
