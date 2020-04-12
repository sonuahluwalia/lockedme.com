package com.lockedme;

import com.lockedme.dao.impl.FileDAOImpl;
import com.lockedme.exception.DAOException;
import com.lockedme.helper.Message;

public class Main {
	private static InputValidationsImpl input;
	private static FileDAOImpl fo;
	private static String optionChoice;
	private static int choice2;

	public static void initializeApplication() {
		input = new InputValidationsImpl();
		fo = new FileDAOImpl();

	}

	public static void main(String[] args) {

		initializeApplication();
		int mainChoice = input.readMainOption();

		loop: while (true) {
			switch (mainChoice) {
			case 1:
				optionChoice = "main_menu";
				try {
					fo.retrieveFiles();
				} catch (DAOException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				break;
			case 2:
				optionChoice = "main_menu";
				choice2 = input.readOption2();
				switch (choice2) {
				case 1:
					optionChoice = "second_menu";
					fo.addFiles(input.readFilename());
					break;
				case 2:
					optionChoice = "second_menu";
					fo.deleteFile(input.readFilename());
					break;
				case 3:
					optionChoice = "second_menu";
					fo.searchFile(input.readFilename());
					break;
				case 4:
					optionChoice = "main_menu";
					break;
				}
				break;
			case 3:
				Message.exitMessage();
				break loop;
			default:
			}
			if (optionChoice.equals("main_menu")) {
				mainChoice = input.readMainOption();
			} else if (optionChoice.equals("second_menu")) {
				choice2 = input.readOption2(); 
			}
		}
	}

}
