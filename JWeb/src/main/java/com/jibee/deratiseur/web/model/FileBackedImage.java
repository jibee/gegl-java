package com.jibee.deratiseur.web.model;

import java.io.File;

import eu.webtoolkit.jwt.WFileResource;
import eu.webtoolkit.jwt.WLink;
import eu.webtoolkit.jwt.WResource;

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

	@Override
	public WLink getResourceLink(RenderSize size) {
		// TODO on the fly resizing + caching?
		// TODO delegate this to a dedicated servlet?
		WResource resource = new WFileResource("image/jpeg", m_file.getAbsolutePath());
		WLink retval = new WLink(resource);
		return retval;
	}
	

}
