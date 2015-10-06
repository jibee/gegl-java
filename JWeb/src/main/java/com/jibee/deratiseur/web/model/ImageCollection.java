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
	private List<? extends IImage> m_files;

	public ImageCollection(iFolder arg) {
		m_files = arg.getAllImages();
	}

	public ImageCollection() 
	{
		m_files = new Vector<IImage>();
	}

	@Override
	public int getStacksCount() {
		return m_files.size();
	}

	@Override
	public int getImageCount() {
		return m_files.size();
	}

	@Override
	public StackIndex getImageIndex(int i) {
		return new OurIndex(i);
	}

	@Override
	public ImageIndex getImageIndex(StackIndex stackIndex, int i) {
		return (OurIndex)stackIndex;
	}

	@Override
	public int getTotalImageCount(StackIndex parent) {
		return 1;
	}

	@Override
	public int getImageCount(StackIndex parent) {
		return 1;
	}

	@Override
	public IImage getImageAt(ImageIndex index) {
		return m_files.get(((OurIndex) index).getIndex());
	}

}
