package com.lockedme.helper;

public class Message {
	public static void welcome() {
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developed by Sonu Ahluwalia");
		System.out.println("Main Menu options:");
		System.out.println("Option 1: Retrieve file names in ascending order");
		System.out.println("Option 2: Add or Delete or Search a file");
		System.out.println("Option 3: Exit the Application");

	}

	public static void invalidMessage() {

		welcome();
		System.out.println("Invalid input. Please input again.");
	}

	public static void option2Message() {
		System.out.println("Menu 2 options:");
		System.out.println("Option 1: Add a file to the existing directory list");
		System.out.println("Option 2: Delete a user specified file from the existing directory list");
		System.out.println("Option 3: Search a user specified file from the main directory");
		System.out.println("Option 4: Navigate back to the main menu");

	}
	public static void invalidOption2Message() {

		option2Message();
		System.out.println("Invalid Option 2 input. Please input again.");
	}

	public static void readFilenameMessage() {
		System.out.println("Please enter the filename");
	}
	
	public static void exitMessage () {
		System.out.println("Application Exited");
	}
}
