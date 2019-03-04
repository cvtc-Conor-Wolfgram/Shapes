package org.cvtc.shapes;
/**
 * 
 */

/**
 * @author Conor
 *
 */
public abstract class Shape implements Renderer{
	
	//Create variable for new MessageBox
	private Dialog messageBox;
	
	// Get the messageBox
	protected Dialog getMessageBox(){
		
		return messageBox;
	}
	
	// Set the messageBox
	private void setMessageBox(){
		this.messageBox = messageBox;
	}
	
	// Super Constructor that accepts a MessageBox
	public Shape(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	//Abstract methods for surface area and volume	
	public abstract float surfaceArea();
	public abstract float volume();
	public abstract void render();
}
