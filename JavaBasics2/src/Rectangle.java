/**
 * 
 */

/**
 * @author Kevin
 * Rectangle Class that implements Shape
 */
public class Rectangle implements Shape{

	float height, width;
	
	public Rectangle(double a, double b) {
		
		height = (float) a;
		width = (float) b;
	}

	@Override
	public float calculateArea() {
		
		return this.height * this.width;
	}

	@Override
	public void display() {
		
		System.out.println("Rectangle Area: " + this.calculateArea());
		
	}

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(2.5, 3);
		r.display();

	}
}
