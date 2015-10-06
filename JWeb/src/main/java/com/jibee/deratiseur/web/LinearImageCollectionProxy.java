package com.jibee.deratiseur.web;

import com.jibee.deratiseur.web.model.IImage;
import com.jibee.deratiseur.web.model.IImageCollectionModel;

import eu.webtoolkit.jwt.ItemDataRole;
import eu.webtoolkit.jwt.WAbstractItemModel;
import eu.webtoolkit.jwt.WModelIndex;

public class LinearImageCollectionProxy extends WAbstractItemModel {

	private IImageCollectionModel m_model;

	public LinearImageCollectionProxy(IImageCollectionModel model) {
		m_model = model;
	}

	@Override
	public int getColumnCount(WModelIndex parent) {
		return m_model.getStacksCount();
	}

	@Override
	public int getRowCount(WModelIndex parent) {
		return 1;
	}

	@Override
	public WModelIndex getParent(WModelIndex index) {
		return null;
	}

	@Override
	public Object getData(WModelIndex index, int role) {
		IImage image = m_model.getImageAt(m_model.getImageIndex(m_model.getImageIndex(index.getColumn()), 0));
		switch(role)
		{
		case ItemDataRole.DisplayRole:
			return image.getFilename();
		}
		return null;
	}

	@Override
	public WModelIndex getIndex(int row, int column, WModelIndex parent) {
		return createIndex(row, column, 0);
	}

}
