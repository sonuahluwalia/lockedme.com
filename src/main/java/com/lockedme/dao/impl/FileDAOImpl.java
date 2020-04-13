package com.lockedme.dao.impl;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.lockedme.Message;
import com.lockedme.dao.FileDAO;
import com.lockedme.exception.DAOException;

public class FileDAOImpl implements FileDAO {


	public void retrieveFiles() {
 
		File dir = new File(System.getProperty("user.dir"));
		String[] files = dir.list();
		Arrays.sort(files);
		if (files.length == 0) {
			Message.printMessage("Directory is empty");
		 } else {
			for (String aFile : files) {
				Message.printMessage(aFile);
			}
		}
	}

	public void addFiles(String filename) {

 		File file = new File(filename);

		try {
			if (file.createNewFile()) {
				Message.printMessage(file.getAbsolutePath() + " File Created");
			} else
				Message.printMessage("File " + file.getAbsolutePath() + " already exists");
		} catch (IOException e) {
			Message.printMessage(e.getMessage());
		}
	}

	public void deleteFile(String fileName) {
		try {
			File f = new File(fileName); // file to be delete
			if (f.delete()) // returns Boolean value
			{
				Message.printMessage(f.getName() + " deleted"); // getting and printing the file name
			} else {
				Message.printMessage("File not found in the location "+f.getAbsolutePath());
			}
		} catch (Exception e) {
			Message.printMessage(e.getMessage());
		}
	}

	public void searchFile(String fileName) {
		File f = new File(fileName); // file to be delete
		File dir = new File(System.getProperty("user.dir"));
		String[] files = dir.list();
		boolean flag = false;

		if (files.length == 0) {
			Message.printMessage("The directory is empty");
		} else {
			for (String aFile : files) {
				// System.out.println(aFile);
				if (aFile.equals(fileName)) {
					flag = true;
					break;
				}
			}
		}
		if (flag) {
			Message.printMessage("File " + fileName + " found in directory " + dir.getAbsolutePath());
		} else {
			Message.printMessage("File " + fileName + " not found in directory " + dir.getAbsolutePath());
			
		}
	}

}
