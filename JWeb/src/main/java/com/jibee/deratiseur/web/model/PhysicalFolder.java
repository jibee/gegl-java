package com.jibee.deratiseur.web.model;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.List;
import java.util.Vector;

import eu.webtoolkit.jwt.ItemDataRole;

public class PhysicalFolder implements iFolder {

	private File m_folder;

	public PhysicalFolder(String folder) {
		m_folder = new File(folder);
	}
	public PhysicalFolder(File folder) {
		m_folder = folder;
	}

	@Override
	public List<iFolder> subFolders() {
		FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		File[] elements = m_folder.listFiles(filter);
		Vector<iFolder> retval = new Vector<iFolder>();
		if(null!=elements)
		{
			for(File f: elements)
			{
				retval.add(new PhysicalFolder(f));
			}
		}
		return retval;
	}

	@Override
	public Object getData(int role) {
		switch(role)
		{
		case ItemDataRole.DisplayRole:
			return m_folder.getName();
		}
		return null;
	}
	@Override
	public List<File> getAllImages() {
		// TODO recurse into subfolders
		FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File file) {
				if(!file.isDirectory())
				{
					// TODO expand list of extensions
					if(file.getName().endsWith("CR2"))
						return true;
				}
				return false;
			}
		};
		File[] elements = m_folder.listFiles(filter);
		Vector<File> retval = new Vector<File>();
		if(null!=elements)
		{
			for(File f: elements)
			{
				retval.add(f);
			}
		}
		return retval;
	}
}
