package com.lockedme.dao;

import com.lockedme.exception.DAOException;

public interface FileDAO {

	void retrieveFiles() throws DAOException;

	void addFiles(String filename);

	void deleteFile(String fileName);

	void searchFile(String fileName);

}