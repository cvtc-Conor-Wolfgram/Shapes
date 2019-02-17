package org.cvtc.shapes;
/**
 * 
 */

/**
 * @author Conor
 *
 */
public abstract class Shape {
	
	//Create variable for new MessageBox
	private MessageBox messageBox;
	
	// Get the messageBox
	protected MessageBox getMessageBox(){
		
		return messageBox;
	}
	
	// Set the messageBox
	private void setMessageBox(){
		this.messageBox = messageBox;
	}
	
	// Super Constructor that accepts a MessageBox
	public Shape(MessageBox messageBox) {
		this.messageBox = messageBox;
	}
	
	//Abstract methods for surface area and volume	
	public abstract float surfaceArea();
	public abstract float volume();
}
