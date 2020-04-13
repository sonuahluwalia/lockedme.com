package com.lockedme;

public class Message {
	public static void welcome() {
		printMessage("Welcome to LockedMe.com");
		printMessage("Developed by Sonu Ahluwalia");
		printMessage("Main Menu options:");
		printMessage("Option 1: Retrieve file names in ascending order");
		printMessage("Option 2: Add or Delete or Search a file");
		printMessage("Option 3: Exit the Application");

	}

	public static void invalidMessage() {

		welcome();
		printMessage("Invalid input. Please input again.");
	}

	public static void option2Message() {
		printMessage("Menu 2 options:");
		printMessage("Option 1: Add a file to the existing directory list");
		printMessage("Option 2: Delete a user specified file from the existing directory list");
		printMessage("Option 3: Search a user specified file from the main directory");
		printMessage("Option 4: Navigate back to the main menu");

	}
	public static void invalidOption2Message() {

		option2Message();
		printMessage("Invalid Option 2 input. Please input again.");
	}

	public static void readFilenameMessage() {
		printMessage("Please enter the filename");
	}
	
	public static void exitMessage () {
		printMessage("Application Exited");
	}
	
	public static void retrieveFilesPrint(String[] files) {

	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
