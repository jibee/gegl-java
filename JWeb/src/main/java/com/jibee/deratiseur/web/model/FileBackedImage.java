package com.jibee.deratiseur.web.model;

import java.io.File;

public class FileBackedImage implements IImage {

	private File m_file;

	public FileBackedImage(File file) {
		m_file = file;
	}

	@Override
	public String getFilename() {
		return m_file.getName();
	}

	public File getFile() {
		return m_file;
	}

}
