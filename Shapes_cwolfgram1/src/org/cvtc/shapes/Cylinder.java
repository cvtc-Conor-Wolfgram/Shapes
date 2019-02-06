/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Conor
 *
 */
public class Cylinder extends Shape {
	//Cylinder radius
	private float radius;
	//Cylinder height
	private float height;
	
	//Default constructor setting values to 0
	public Cylinder() {
		this.radius = 0;
		this.height = 0;
	}
	
	//Constructor setting variables to passed in values above 0
	public Cylinder(float radius, float height) {
		
		if(radius >= 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
		
		if (height >=0) {
			this.height = height;
		} else {
			this.height = 0;
		}
	}
	
	// Get radius
	public float getRadius() {
		return radius;
	}
	
	//Set radius
	private void setRadius(float radius) {
		if(radius >= 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	}
	
	//Get height
	public float getHeight() {
		return height;
	}
	
	//set height
	private void setHeight(float height) {
		if (height <=0) {
			this.height = height;
		} else {
			this.height = 0;
		}
	}
	

	@Override
	// Returns surface area of cylinder
	public float surfaceArea() {
		return (float) (2.0 * Math.PI * radius * height + 2.0 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	//Returns volume of cylinder
	public float volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}
	
	@Override
	//Displays cylinder stats including surface area and volume in message panel
	public void render() {
		JOptionPane renderMessage = new JOptionPane();
		
		JOptionPane.showMessageDialog(renderMessage, "Cylinder Dimensions: \n Radius: " + radius + "\n Height: " + height +
				"\n Surface Area: " + surfaceArea() + "\n Volume: " + volume());

	}

}
