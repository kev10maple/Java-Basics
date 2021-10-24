/**
 * 
 */
package com.ss.jb.three;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Kevin
 * Counts the number of times a particular character appears in a file
 */
public class CountCharacter {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			
			System.out.println("Can only enter single number in Command Line");
			
		}
		
		int counter = 0;
		String path = "C:\\Users\\Kevin\\git\\Java-Basics\\JavaBasics2\\src\\com\\ss\\jb\\three\\test.txt";
		char letter = args[0].charAt(0);
		File file = new File(path);
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				
				for(int i = 0; i < line.length(); i++) {
					
					if(line.charAt(i) == letter) {
						
						counter++;
						
					}
					
				}
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found");
			
		} catch (IOException e) {
		
			System.out.println("There was an error");
			
		}
		
		System.out.println("The character " + letter + " shows up " + counter + " times.");
		
	}

}
