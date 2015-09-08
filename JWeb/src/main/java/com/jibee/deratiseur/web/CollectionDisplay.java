package com.jibee.deratiseur.web;

import java.util.EnumSet;
import java.util.Stack;

import com.jibee.deratiseur.web.model.IImage;
import com.jibee.deratiseur.web.model.IImageCollectionModel;
import com.jibee.deratiseur.web.model.IImageCollectionModel.ImageIndex;
import com.jibee.deratiseur.web.model.IImageCollectionModel.StackIndex;

import eu.webtoolkit.jwt.EventSignal1;
import eu.webtoolkit.jwt.RenderFlag;
import eu.webtoolkit.jwt.WAbstractItemView.ScrollHint;
import eu.webtoolkit.jwt.WCompositeWidget;
import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WScrollEvent;
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
	protected WContainerWidget m_main_container;
	private boolean m_dirty;
	private int renderedFirstRow_;
	private int renderedLastRow_;
	private IImageCollectionModel m_model;

	/** 
	Sets the model.
	
	The View will display data of the given model and changes in the model are reflected by the View.
	
	The initial model is 0.
	 */
	public void setModel(IImageCollectionModel model) {
		m_model = model;
		m_dirty = true;
		scheduleRender();
	}

	/** Override to base class - renders the widget.
	
	 We override this method to delay the table contents update as late as we can.
	 */
	@Override
	public void render(EnumSet<RenderFlag> flags) {
		// do our own rendering
		renderPage();
		m_dirty = false;
		super.render(flags);
	}

	/** Our own late rendering. 
	 * 
	 */
	private void renderPage() {
		// Empty the table. There is room for optimisation on this bit
		m_main_container.clear();
		if(null==getModel())
		{
			return;
		}
	
		int rowCount = getModel().getStacksCount();
		//		Now iterates through each item in the model 
		for(int i = 0; i<rowCount; ++i)
		{
			StackIndex index = getModel().getImageIndex(i);
			m_main_container.addWidget(itemWidget(index)); 
		}
	}

	private IImageCollectionModel getModel() {
		return m_model;
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

	public void scrollTo(ImageIndex index, ScrollHint hint) {
		// TODO Auto-generated method stub
		
	}

	public EventSignal1<WScrollEvent> scrolled() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void modelDataChanged(StackIndex left, StackIndex right) {
		// TODO Auto-generated method stub
		
	}

	protected void selectRange(StackIndex first, StackIndex last) {
		// TODO Auto-generated method stub
		
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
		m_main_container = new WContainerWidget();
		setImplementation(m_main_container);

	}


}
