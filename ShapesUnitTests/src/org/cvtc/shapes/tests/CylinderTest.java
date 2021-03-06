package org.cvtc.shapes.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.MessageBox;
import org.junit.Test;

public class CylinderTest {
	
	//Test objects
	MessageBoxSub messageBoxSub = new MessageBoxSub();
	MessageBox messageBox = new MessageBox();
	Cylinder normalCylinder = new Cylinder(messageBox, 1.0f, 1.0f);
	Cylinder negativeCylinder = new Cylinder(messageBox, -1.0f, -1.0f);
	Cylinder zeroCylinder = new Cylinder(messageBox, 0.0f, 0.0f);

	@Test //Testing Surface Area
	public void testSurfaceArea() {
		assertEquals(12.57f, normalCylinder.surfaceArea(), 0.01);
		assertEquals(0.0f, negativeCylinder.surfaceArea(), 0.0);
		assertEquals(0.0f, zeroCylinder.surfaceArea(), 0.0);
	}

	@Test //Testing Volume
	public void testVolume() {
		assertEquals(3.14f, normalCylinder.volume(), 0.01);
		assertEquals(0.0f, negativeCylinder.volume(), 0.0);
		assertEquals(0.0f, zeroCylinder.volume(), 0.0);
	}

	@Test //Testing constructor and logic
	public void testCylinderFloatFloat() {
		assertEquals(1.0f, normalCylinder.getRadius(), 0.0);
		assertEquals(1.0f, normalCylinder.getHeight(), 0.0);

	
		assertEquals(0.0f, negativeCylinder.getRadius(), 0.0);
		assertEquals(0.0f, negativeCylinder.getHeight(), 0.0);
		
		assertEquals(0.0f, zeroCylinder.getRadius(), 0.0);
		assertEquals(0.0f, zeroCylinder.getHeight(), 0.0);;
		
	}

	@Test //Testing getRadius
	public void testGetRadius() {
		assertEquals(1.0f, normalCylinder.getRadius(), 0.0);
	}

	@Test //Testing getHeight
	public void testGetHeight() {
		assertEquals(1.0f, normalCylinder.getHeight(), 0.0);
	}

	@Test //Testing render
	public void testRender() {
		assertEquals(0x00, messageBoxSub.show(null, null));
	}
}
