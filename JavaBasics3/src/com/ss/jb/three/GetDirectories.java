/**
 * 
 */
package com.ss.jb.three;

import java.io.File;
import java.util.Scanner;

/**
 * @author Kevin Gets a list of all file/directory names under a given directory
 */
public class GetDirectories {

	//Lists the files and in all sub-directories
	public static void listDir(File f) {

		try {

			File [] toList = f.listFiles();

			for (File file : toList) {

				if(file.isDirectory()) {
					
					System.out.println(file);
					listDir(file);
				}
				
				else {
					
					System.out.println(file.getName());
					
				}

			}
		} catch (NullPointerException e) {

			System.out.println("Invalid Directory");

		}

	}

	public static void main(String[] args) {

		System.out.println("Enter Directory: ");

		try (Scanner input = new Scanner(System.in)) {

			String dir = input.nextLine();
			File f = new File(dir);

			if (f.exists()) {

				System.out.println("In the directory, " + dir);

			}

			listDir(f);

		}

	}

}
