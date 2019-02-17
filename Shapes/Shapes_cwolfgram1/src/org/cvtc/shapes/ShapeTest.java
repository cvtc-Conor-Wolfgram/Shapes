package org.cvtc.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		// New MessageBox for all constructors to use
		MessageBox messageBox = new MessageBox();
		
		// Create new cuboid and render it
		Cuboid cuboid = new Cuboid(messageBox, 2.0f, 3.0f, 4.0f);
		cuboid.render();
		
		// Create new cylinder and render it
		Cylinder cylinder = new Cylinder(messageBox, 2.0f, 3.0f);
		cylinder.render();
		
		// Create new sphere and render it
		Sphere sphere = new Sphere(messageBox, 2.0f);
		sphere.render();

	}

}
