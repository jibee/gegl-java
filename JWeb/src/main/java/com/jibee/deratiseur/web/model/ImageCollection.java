package com.jibee.deratiseur.web.model;

import java.io.File;
import java.util.List;
import java.util.Vector;

/** Collection of images backed by an explicit list of images 
 * 
 * @author jibee
 *
 */
public class ImageCollection implements IImageCollectionModel {
	
	private static class OurIndex implements StackIndex, ImageIndex
	{
		private int m_index;

		public OurIndex(int i) {
			m_index = i;
		}
		public int getIndex()
		{
			return m_index;
		}
		
	}
	
// TODO use a proxy class with the info we need to store
	private List<File> m_files;

	public ImageCollection(iFolder arg) {
		m_files = arg.getAllImages();
	}

	public ImageCollection() 
	{
		m_files = new Vector<File>();
	}

	public int getStacksCount() {
		return m_files.size();
	}

	public int getImageCount() {
		return m_files.size();
	}

	public StackIndex getImageIndex(int i) {
		return new OurIndex(i);
	}

	public ImageIndex getImageIndex(StackIndex stackIndex, int i) {
		return (OurIndex)stackIndex;
	}

	public int getTotalImageCount(StackIndex parent) {
		return 1;
	}

	public int getImageCount(StackIndex parent) {
		return 1;
	}

	public IImage getImageAt(ImageIndex index) {
		return new FileBackedImage(m_files.get(((OurIndex) index).getIndex()));
	}

}
