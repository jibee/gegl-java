package com.jibee.deratiseur.web;

import java.util.EnumSet;
import java.util.List;
import java.util.SortedSet;
import java.util.Vector;

import com.jibee.deratiseur.web.model.IImage;
import com.jibee.deratiseur.web.model.IImageCollectionModel;
import com.jibee.deratiseur.web.model.IImageCollectionModel.StackIndex;

import eu.webtoolkit.jwt.ItemDataRole;
import eu.webtoolkit.jwt.SelectionMode;
import eu.webtoolkit.jwt.Signal1;
import eu.webtoolkit.jwt.Signal2;
import eu.webtoolkit.jwt.ViewItemRenderFlag;
import eu.webtoolkit.jwt.WAbstractItemDelegate;
import eu.webtoolkit.jwt.WLength.Unit;
import eu.webtoolkit.jwt.WCompositeWidget;
import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WLength;
import eu.webtoolkit.jwt.WModelIndex;
import eu.webtoolkit.jwt.WMouseEvent;
import eu.webtoolkit.jwt.WTableView;
import eu.webtoolkit.jwt.WText;
import eu.webtoolkit.jwt.WWidget;


/** Display for a collection of images 
 * 
 * THis widget renders a collection of image stacks as a linear view.
 * 
 * @author jibee
 *
 */
public class CollectionDisplay extends WCompositeWidget {

	/** Container for the items displayed */
	protected WTableView m_main_container;
	private IImageCollectionModel m_model;
	private Signal1<List<IImage>> m_selectionUpdated;

	/** 
	Sets the model.
	
	The View will display data of the given model and changes in the model are reflected by the View.
	
	The initial model is 0.
	 */
	public void setModel(IImageCollectionModel model) {
		m_model = model;
		m_main_container.setModel(new LinearImageCollectionProxy(model));
	}


	public WWidget itemWidget(StackIndex index) {
		int count = m_model.getImageCount(index);
		int totalcount = m_model.getTotalImageCount(index);
		WContainerWidget stackContainer = new WContainerWidget();
		if(count>1)
		{
			// Add expanded stack style
		}
		else if(totalcount>1)
		{
			// Add collapsed stack style
		}
		for(int i=0; i<count; ++i)
		{
			IImage image = m_model.getImageAt(m_model.getImageIndex(index, i));
			Thumbnail t = new Thumbnail(image);
			stackContainer.addWidget(t);
		}
		return stackContainer;
	}
	/** Constructor */
	public CollectionDisplay()
	{
		this(null);
	}
	/** Constructor setting the parent
	 * 
	 * @param parent parent container
	 */
	public CollectionDisplay(WContainerWidget parent)
	{
		super(parent);
		// add forward / backward buttons
		m_main_container = new WTableView();
		m_main_container.clicked().addListener(this, new Signal2.Listener<WModelIndex, WMouseEvent>() {
			@Override
			public void trigger(WModelIndex arg1, WMouseEvent arg2) {
				mouseClick(arg1, arg2);
			}
		});
		/*
		m_main_container.selectionChanged().addListener(this, new Listener() {
			@Override
			public void trigger() {
				updateSelection();
			}
		});
		*/
		m_main_container.setSelectionMode(SelectionMode.ExtendedSelection);
		setImplementation(m_main_container);
		m_main_container.setHeaderHeight(new WLength(0, Unit.Pixel));
		setLayoutSizeAware(true);
		m_main_container.setItemDelegate(new WAbstractItemDelegate() {
			@Override
			public WWidget update(WWidget widget, WModelIndex index, EnumSet<ViewItemRenderFlag> flags) {
				IImage image =(IImage)index.getData(LinearImageCollectionProxy.ImageObjectRole);
				if(null==image)
					return new WText((String)index.getData(ItemDataRole.DisplayRole));
				else
					return new Thumbnail(image);
			}
		});
	}
	protected void mouseClick(WModelIndex arg1, WMouseEvent arg2) {
//		arg2.getModifiers().contains(KeyboardModifier.ShiftModifier)
		List<IImage> s = new Vector<>();
		IImage image = (IImage)arg1.getData(LinearImageCollectionProxy.ImageObjectRole);
		s.add(image);
		selectionUpdated().trigger(s);
	}


	protected void updateSelection() {
		SortedSet<WModelIndex> selection = m_main_container.getSelectedIndexes();
		List<IImage> s = new Vector<>();
		for(WModelIndex i: selection)
		{
			IImage image = (IImage)i.getData(LinearImageCollectionProxy.ImageObjectRole);
			s.add(image);
		}
		selectionUpdated().trigger(s);
	}


	public Signal1<List<IImage> > selectionUpdated() {
		if(null==m_selectionUpdated)
			m_selectionUpdated = new Signal1<>();
		return m_selectionUpdated;
	}


	@Override
	protected void layoutSizeChanged(int width, int height) {
		super.layoutSizeChanged(width, height);
		m_main_container.setRowHeight(new WLength(height-10, Unit.Pixel));
	}


}
