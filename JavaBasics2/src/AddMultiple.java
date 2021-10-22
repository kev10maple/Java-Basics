/**
 * 
 */

/**
 * @author Kevin
 * We are trying to return the sum of command line arguments
 */
public class AddMultiple {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(String s : args) {
			
			try {
				
				sum += Integer.parseInt(s);
				
			} catch(NumberFormatException e) {
				
				System.out.println("Invalid integer command line argument");
				
			}
		}
		
		System.out.println("The sum of the arguments is: " + sum);

	}

}
