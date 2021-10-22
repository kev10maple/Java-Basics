/**
 * 
 */

/**
 * @author Kevin
 *
 */
public class Triangle implements Shape{

	long base, height;
	
	public Triangle(long b, long h) {
		
		base = b;
		height = h;
		
	}

	@Override
	public float calculateArea() {
		
		return (float)(base * height) / 2;
		
	}

	@Override
	public void display() {
		
		System.out.println("Triangle Area: " + this.calculateArea());
		
	}
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle(3, 4);
		t.display();

	}

}
