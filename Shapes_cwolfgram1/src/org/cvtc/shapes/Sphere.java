/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Conor
 *
 */
public class Sphere extends Shape {
	
	//Sphere's radius
	private float radius;
	
	//Default constructor setting radius to 0
	public Sphere() {
		this.radius = 0;
	}
	
	//Constructor setting radius >= 0 to passed in value
	public Sphere(float radius) {
		
		if(radius >= 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	}
	
	// Get Radius
	public float getRadius() {
		return radius;
	}
	
	// Set Radius
	private void setRadius(float radius) {
		if(radius >= 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	}
	

	@Override
	// Returns surface area of sphere
	public float surfaceArea() {
		return (float) (4.0 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	//Returns volume of sphere
	public float volume() {
		return (float) ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
	}
	
	@Override
	//Displays sphere stats including surface area and volume in message panel
	public void render() {
		JOptionPane renderMessage = new JOptionPane();
		
		JOptionPane.showMessageDialog(renderMessage, "Sphere Dimensions: \n Radius: " + radius + "\n Surface Area: " + surfaceArea() + "\n Volume: " + volume());

	}

}
