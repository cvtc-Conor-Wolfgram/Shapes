package org.cvtc.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		//Message box to be passed in as dialog parameter
		MessageBox messageBox = new MessageBox();
		
		// New Factory to make shapes
		ShapeFactory newFactory = new ShapeFactory(messageBox);
		
		// Create new cuboid and render it
		Shape cuboid = newFactory.make(ShapeType.Cuboid);
		cuboid.render();
		
		// Create new cylinder and render it
		Shape cylinder = newFactory.make(ShapeType.Cylinder);
		cylinder.render();
		
		// Create new sphere and render it
		Shape sphere = newFactory.make(ShapeType.Sphere);
		sphere.render();

	}

}
