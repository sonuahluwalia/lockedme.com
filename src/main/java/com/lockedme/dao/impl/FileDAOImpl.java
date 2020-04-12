package com.lockedme.dao.impl;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.lockedme.dao.FileDAO;
import com.lockedme.exception.DAOException;

public class FileDAOImpl implements FileDAO {


	public void retrieveFiles() throws DAOException {
 
		File dir = new File(System.getProperty("user.dir"));
		String[] files = dir.list();
		Arrays.sort(files);
		if (files.length == 0) {
			//System.out.println("The directory is empty");
			throw new DAOException("Directory is empty");
		} else {
			for (String aFile : files) {
				System.out.println(aFile);
			}
		}

	}

	public void addFiles(String filename) {

 		File file = new File(filename);

		try {
			if (file.createNewFile()) {
				System.out.println(file.getAbsolutePath() + " File Created");
			} else
				System.out.println("File " + file.getAbsolutePath() + " already exists");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void deleteFile(String fileName) {
		try {
			File f = new File(fileName); // file to be delete
			if (f.delete()) // returns Boolean value
			{
				System.out.println(f.getName() + " deleted"); // getting and printing the file name
			} else {
				System.out.println("File not found in the location "+f.getAbsolutePath());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void searchFile(String fileName) {
		File f = new File(fileName); // file to be delete
		File dir = new File(System.getProperty("user.dir"));
		String[] files = dir.list();
		boolean flag = false;

		if (files.length == 0) {
			System.out.println("The directory is empty");
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
			System.out.println("File " + fileName + " found in directory " + dir.getAbsolutePath());
		} else {
			System.out.println("File " + fileName + " not found in directory " + dir.getAbsolutePath());
			
		}
	}

}
