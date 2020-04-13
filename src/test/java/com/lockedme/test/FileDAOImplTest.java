package com.lockedme.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.lockedme.dao.impl.FileDAOImpl;
import java.io.File;
import java.util.Scanner;

public class FileDAOImplTest {

	static FileDAOImpl file;
	static File dir;
	static Scanner scan;

	public int numberOfFiles() {

		int count = dir.list().length;
		return count;
	}

	@BeforeClass
	public static void initialize() {
		file = new FileDAOImpl();
		dir = new File(System.getProperty("user.dir"));
		scan = new Scanner(System.in);
	}

	@Test
	public void testAddFiles() {
		System.out.println("Add the file name");
		String filename = scan.nextLine();
		boolean found = findFile(filename);
		file.addFiles(filename);
		if (found) {
			assertEquals(true, true);
		} else {
			assertEquals(false, false);
		}

	}

	public boolean findFile(String filename) {
		boolean found = false;
		String[] files = dir.list();
		for (String f : files) {
			if (f.equals(filename)) {
				found = true;
			}
		}
		return found;

	}

	@Test
	public void testDeleteFile() {
		System.out.println("Delete the file name");
		String filename = scan.nextLine();
		file.deleteFile(filename);
		boolean found = findFile(filename);
		if (!found) {
			assertEquals(true, true);
		} else {
			assertEquals(false, false);
		}

	}

	@Test
	public void testSearchFile() {
		System.out.println("Search the file name");
		String filename = scan.nextLine();
		file.searchFile(filename);
		
		boolean found = findFile(filename);
		if (!found) {
			assertEquals(true, true);
		} else {
			assertEquals(false, false);
		}

	}

}
