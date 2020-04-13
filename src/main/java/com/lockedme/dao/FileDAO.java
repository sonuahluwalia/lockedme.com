package com.lockedme.dao;



public interface FileDAO {

	void retrieveFiles();

	void addFiles(String filename);

	void deleteFile(String fileName);

	void searchFile(String fileName);

}