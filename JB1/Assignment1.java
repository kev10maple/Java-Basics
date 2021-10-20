//Kevin Wang - JB1 Assignment 1
public class Assignment1{
	
	/* Prints
	   *
	   **
	   ***
	   ****
	   .........
	 */
	public static void leftTriangle() {
		
		//number of rows of stars
		int rows = 4;
		
		System.out.println("1)");
		
		//for every single row
		for(int i = 0; i < rows; i++) {
			//how many stars to print for each row
			for(int j = 0; j <= i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println(".........");
		
	}
	
	/* Prints
	 ..........
	 ****
	 ***
	 **
	 *
	 */
	public static void invertedLeftTriangle() {
		
		//number of rows of stars
		int rows = 4;
		
		System.out.println("2)");
		System.out.println("..........");
		
		//for every row starting from high to low
		for(int i = rows-1; i >= 0; i--) {
			//how many stars to print
			for(int j = 0; j <= i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
	
	/* Prints
     *
    ***
   *****
  *******
...........
	 */
	public static void pyramid() {
		
		int rows = 4;
		
		System.out.println("3)");
		
		for(int i = 1; i <= rows; i++) {
			
			for(int spaces = -1; spaces <= rows-i; spaces++) {
				
				System.out.print(" ");
				
			}
			
			int star = 0;
			
			while(star != (2*i - 1)) {
				
				System.out.print("*");
				star++;
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("...........");
		
	}
	
	/* Prints
............
  *******
   *****
    ***
     *
	 */
	public static void invertedPyramid() {
		
		int rows = 4;
		
		System.out.println("4)");
		System.out.println("............");
		
		for(int i = rows; i >= 1; i--) {
			
			for(int spaces = -1; spaces <= rows-i; spaces++) {
				
				System.out.print(" ");
				
			}
			
			int star = 0;
			
			while(star != (2*i - 1)) {
				
				System.out.print("*");
				star++;
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void main(String args[])
	{
		
		leftTriangle();
		invertedLeftTriangle();
		pyramid();
		invertedPyramid();
		
	}
}
