package com.jibee.deratiseur.web.model;

public interface IImageCollectionModel {
	public static interface StackIndex
	{
	}
	
	public static interface ImageIndex
	{
	}

	/** Obtains the number of stacks. This is the maximum index -1 that can be passed to getIndex.
	 * 
	 * @return
	 */
	int getStacksCount();
	/** Obtains the number of images. This is the number of stacks plus the number of visible sub-stack images
	 * 
	 * @return
	 */
	int getImageCount();
	/** Obtains the Index for the stack at order i 
	 * 
	 * @param i
	 * @return
	 */
	StackIndex getImageIndex(int i);
	/** Obtains the Index for the image in the given stack at order i 
	 * 
	 * @param i
	 * @return
	 */
	ImageIndex getImageIndex(StackIndex stackIndex, int i);
	/** Obtains the number of images in the given stack, including the hidden and collapsed ones
	 * 
	 * @param parent
	 * @return
	 */
	int getTotalImageCount(StackIndex parent);
	/** Obtains the number of images in the given stack
	 * 
	 * @param parent
	 * @return
	 */
	int getImageCount(StackIndex parent);
	/** Obtains the image at the given image index 
	 * 
	 * @param index
	 * @return
	 */
	IImage getImageAt(ImageIndex index);

}
