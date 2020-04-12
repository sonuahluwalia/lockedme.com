package com.lockedme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.regex.Pattern;

import com.lockedme.helper.Message;

public class InputValidationsImpl implements InputValidations {
 	String option;
	int userInput;
	BufferedReader scan;

	public int readMainOption() {
		Message.welcome();
		scan = new BufferedReader(new InputStreamReader(System.in));
 		try {
			option = scan.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return validateUserInput();
	}

	private int validateUserInput() {
		userInput = validateNumber();
		userInput = validateMainOption();
		return userInput;

	}

	private int validateNumber() {
		if (isNumeric(option)) {
			return Integer.parseInt(option); // user input is an integer
		} else {			
			return -1;
		}

	}

	private int validateMainOption() {

		while (userInput < 1 || userInput > 3) {
			Message.invalidMessage();
			try {
				option = scan.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			if (isNumeric(option)) {
				userInput = Integer.parseInt(option); // user input is an integer
			}
		}
		return userInput;

	}

	private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

	private boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		return pattern.matcher(strNum).matches();
	}

	public int readOption2() {
		Message.option2Message();
		scan = new BufferedReader(new InputStreamReader(System.in));
		try {
			option = scan.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return validateOption2();
	}

	private int validateOption2() {
		userInput = validateNumber();
		userInput = validateOption2Choice();
		return userInput;

	}

	private int validateOption2Choice() {

		while (userInput < 1 || userInput > 4) {
			Message.invalidOption2Message();
			try {
				option = scan.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			if (isNumeric(option)) {
				userInput = Integer.parseInt(option); // user input is an integer
			}
		}
		return userInput;

	}

	public String readFilename() {
		Message.readFilenameMessage();
		String fileName = "";
		try {
			fileName = scan.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return fileName;
	}
}
