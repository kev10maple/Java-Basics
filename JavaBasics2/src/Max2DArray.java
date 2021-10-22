import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Kevin Finding the max number in an array and showing its position
 */
public class Max2DArray {

	// making a 3x3 array and filling it with random numbers from 1-100
	int array[][] = new int[3][3];

	public Max2DArray() {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				array[i][j] = ThreadLocalRandom.current().nextInt(0, 101);

			}
		}
	}

	// printing the max value in the array as well as its position
	public void printMax() {

		int row = 0;
		int col = 0;
		int currentMax = array[0][0];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (array[i][j] > currentMax) {
					currentMax = array[i][j];
					row = i;
					col = j;
				}
			}
		}

		System.out.println("Max number: " + currentMax);
		System.out.println("The Max number was found at row " + row + " and column " + col);
	}

	public void displayArray() {
		// prints out the contents of the array
		for (int[] row : array) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static void main(String[] args) {

		Max2DArray a = new Max2DArray();

		a.displayArray();
		a.printMax();

	}

}
