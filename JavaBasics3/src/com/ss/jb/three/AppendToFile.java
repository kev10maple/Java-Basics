/**
 * 
 */
package com.ss.jb.three;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Kevin 
 * Appends text to an existing file
 */
public class AppendToFile {

	//appends given text to the existing file
	public void append(String s) {

		String path = "C:\\Users\\Kevin\\git\\Java-Basics\\JavaBasics2\\src\\com\\ss\\jb\\three\\test.txt";

		try {

			FileWriter fw = new FileWriter(path, true);
			fw.write(s);
			fw.close();

		} catch (IOException e) {

			System.out.println("Failed to Write");

		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter text to append: ");
		String text = input.nextLine();

		AppendToFile atf = new AppendToFile();
		atf.append(text);

		input.close();

	}

}
