/**
 * 
 */

/**
 * @author Kevin
 * Circle class that implements Shape
 */
public class Circle implements Shape{

	long radius;
	
	public Circle(long r) {
		
		radius = r;
		
	}
	
	@Override
	public float calculateArea() {
		
		return (float) (Math.PI * Math.pow(this.radius, 2));
		
	}

	@Override
	public void display() {
		
		System.out.println("Circle Area: " + this.calculateArea());
		
	}
	
	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		c.display();

	}

}
