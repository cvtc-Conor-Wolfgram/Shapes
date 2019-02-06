package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		
		// Creating and rendering cuboid
		Cuboid cuboid = new Cuboid(3, 4, 5);
		cuboid.render();
		
		// Creating and rendering cylinder
		Cylinder cylinder = new Cylinder(3, 4);
		cylinder.render();
		
		
		//Creating and rendering sphere
		Sphere sphere = new Sphere(5);
		sphere.render();

	}

}
