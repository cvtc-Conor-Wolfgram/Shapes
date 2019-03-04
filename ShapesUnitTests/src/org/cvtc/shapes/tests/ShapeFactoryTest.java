package org.cvtc.shapes.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class ShapeFactoryTest {
	
	// Dummy sub box
	MessageBoxSub messageSub = new MessageBoxSub();
	
	//New factory to be tested
	ShapeFactory shapeFactory = new ShapeFactory(messageSub);

	@Test
	public void testMake() {
		
		//Overrode .equals in Shapes Abstract to make it return object
		
		assertEquals(new Sphere(messageSub, 3), shapeFactory.make(ShapeType.Sphere));
		
		assertEquals(new Cuboid(messageSub, 2, 3, 4), shapeFactory.make(ShapeType.Cuboid));
		
		assertEquals(new Cylinder(messageSub, 2, 3), shapeFactory.make(ShapeType.Cylinder));
	}

}
