package com.jibee.deratiseur.web;

import java.util.EnumSet;
import com.jibee.deratiseur.web.model.IImage;
import com.jibee.deratiseur.web.model.IImageCollectionModel;
import com.jibee.deratiseur.web.model.IImageCollectionModel.ImageIndex;
import com.jibee.deratiseur.web.model.IImageCollectionModel.StackIndex;

import eu.webtoolkit.jwt.EventSignal1;
import eu.webtoolkit.jwt.RenderFlag;
import eu.webtoolkit.jwt.WAbstractItemView.ScrollHint;
import eu.webtoolkit.jwt.WLength.Unit;
import eu.webtoolkit.jwt.WCompositeWidget;
import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WLength;
import eu.webtoolkit.jwt.WScrollEvent;
import eu.webtoolkit.jwt.WTableView;
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

	/** 
	Sets the model.
	
	The View will display data of the given model and changes in the model are reflected by the View.
	
	The initial model is 0.
	 */
	public void setModel(IImageCollectionModel model) {
		m_model = model;
		m_main_container.setModel(new LinearImageCollectionProxy(model));
	}


	/** Our own late rendering. 
	 * 
	 */
	private void renderPage() {
		// Empty the table. There is room for optimisation on this bit
		if(null==m_model)
		{
			return;
		}
	
		int rowCount = m_model.getStacksCount();
		//		Now iterates through each item in the model 
		for(int i = 0; i<rowCount; ++i)
		{
			StackIndex index = m_model.getImageIndex(i);
			//m_main_container.addWidget(itemWidget(index)); 
		}
	}

	protected void selectRange(StackIndex first, StackIndex last) {
		// TODO Auto-generated method stub
		
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
		setImplementation(m_main_container);
		m_main_container.setHeaderHeight(new WLength(0, Unit.Pixel));
		setLayoutSizeAware(true);
	}
	@Override
	protected void layoutSizeChanged(int width, int height) {
		super.layoutSizeChanged(width, height);
		m_main_container.setRowHeight(new WLength(height-10, Unit.Pixel));
	}


}
