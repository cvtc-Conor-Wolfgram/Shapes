package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Conor
 *
 */
public class Cuboid extends Shape {
	// Cuboid's width
	private float width;
	// Cuboid's height
	private float height;
	// Cuboid's depth
	private float depth;
	
	//Default constructor setting all values to 0
	public Cuboid() {
		this.width = 0;
		this.height = 0;
		this.depth = 0;
	}
	
	//Constructor that sets dimensions to passed in value >= 0
	public Cuboid(float width, float height, float depth) {
		
		if(width >= 0) {
			this.width = width;
		} else {
			this.width = 0;
		}
		
		if (height >= 0) {
			this.height = height;
		} else {
			this.height = 0;
		}
		
		if (depth >= 0) {
			this.depth = depth;
		} else {
			this.depth = 0;
		}
	}
	
	//Get width
	public float getWidth() {
		return width;
	}
	
	// Set width
	private void setWidth(float width) {
		if(width >= 0) {
			this.width = width;
		} else {
			this.width = 0;
		}
	}
	
	//Get height
	public float getHeight() {
		return height;
	}
	
	//Set Height
	private void setHeight(float height) {
		if (height >=0) {
			this.height = height;
		} else {
			this.height = 0;
		}
	}
	
	//Get Depth
	public float getDepth() {
		return depth;
	}
	
	//Set Depth
	private void setDepth(float depth) {
		if (depth >= 0) {
			this.depth = depth;
		} else {
			this.depth = 0;
		}
	}

	@Override
	// Returns surface area of cuboid
	public float surfaceArea() {
		return 2 * (width * depth + height * depth + height * width);
	}

	@Override
	//Returns volume of cuboid
	public float volume() {
		return width * height * depth;
	}
	
	@Override
	//Displays cuboid stats including surface area and volume in message panel
	public void render() {
		JOptionPane renderMessage = new JOptionPane();
		
		JOptionPane.showMessageDialog(renderMessage, "Cuboid Dimensions: \n Width: " + width + "\n Height: " + height + "\n Depth: " + depth +
				"\n Surface Area: " + surfaceArea() + "\n Volume: " + volume());
	}

}
