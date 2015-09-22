package com.jibee.deratiseur.web.model;

import java.util.TreeSet;

public class MemorySelectableCollectionProxy implements ISelectableImageCollectionModel {

	private class HashKeyProxyModel implements IImageCollectionModel {
		public HashKeyProxyModel(MemorySelectableCollectionProxy memorySelectableCollectionProxy) {
		}

		@Override
		public int getStacksCount() {
			return m_stackSelection.size();
		}

		@Override
		public int getImageCount() {
			return m_imageSelection.size();
		}

		@Override
		public StackIndex getImageIndex(int i)
		{
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ImageIndex getImageIndex(StackIndex stackIndex, int i) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getTotalImageCount(StackIndex parent) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getImageCount(StackIndex parent) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public IImageStack getImageAt(ImageIndex index) {
			// TODO Auto-generated method stub
			return null;
		}

	}

	private IImageCollectionModel m_collection;
	private HashKeyProxyModel m_selectionObject;
	private TreeSet<Integer> m_stackSelection;
	private TreeSet<Integer> m_imageSelection;

	public MemorySelectableCollectionProxy(IImageCollectionModel imageCollection) {
		m_collection = imageCollection;
		m_imageSelection = new TreeSet<Integer>();
		m_stackSelection = new TreeSet<Integer>();

	}

	@Override
	public int getStacksCount() {
		return m_collection.getStacksCount();
	}

	@Override
	public int getImageCount() {
		return m_collection.getImageCount();
	}

	@Override
	public StackIndex getImageIndex(int i) {
		return m_collection.getImageIndex(i);
	}

	@Override
	public ImageIndex getImageIndex(StackIndex stackIndex, int i) {
		return m_collection.getImageIndex(stackIndex, i);
	}

	@Override
	public int getTotalImageCount(StackIndex parent) {
		return m_collection.getTotalImageCount(parent);
	}

	@Override
	public int getImageCount(StackIndex parent) {
		return m_collection.getImageCount(parent);
	}

	@Override
	public IImage getImageAt(ImageIndex index) {
		return m_collection.getImageAt(index);
	}

	@Override
	public IImageCollectionModel getSelection() {
		if(null==m_selectionObject)
			m_selectionObject = new HashKeyProxyModel(this);
		return m_selectionObject;
	}

}
