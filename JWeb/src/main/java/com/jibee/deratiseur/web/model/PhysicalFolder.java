package com.jibee.deratiseur.web.model;

import java.io.File;
import java.io.FileFilter;
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
	public List<IImage> getImages() {
		// TODO recurse into subfolders
		FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File file) {
				if(!file.isDirectory())
				{
					// TODO expand list of extensions
					if(file.getName().endsWith(".CR2"))
						return true;
					if(file.getName().endsWith(".NEF"))
						return true;
				}
				return false;
			}
		};
		File[] elements = m_folder.listFiles(filter);
		Vector<IImage> retval = new Vector<IImage>();
		if(null!=elements)
		{
			for(File f: elements)
			{
				retval.add(new FileBackedImage(f));
			}
		}
		return retval;
	}
	@Override
	public String getName() {
		return m_folder.getName();
	}
	@Override
	public iFolder newFolder(String f_name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void importImages(List<? extends IImage> toImport) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<IImage> getAllImages() {
		List<IImage> retval = getImages();
		for(iFolder f: subFolders())
		{
			retval.addAll(f.getAllImages());
		}
		return retval;
	}
}
