package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {

	//Test objects
	Sphere normalSphere = new Sphere(1.0f);
	Sphere negativeSphere = new Sphere(-1.0f);
	Sphere zeroSphere = new Sphere(0.0f);
	
	@Test //Testing Surface Area
	public void testSurfaceArea() {
		assertEquals(12.57f, normalSphere.surfaceArea(), 0.01);
		assertEquals(0.0f, negativeSphere.surfaceArea(), 0.0);
		assertEquals(0.0f, zeroSphere.surfaceArea(), 0.0);
	}
 
	@Test //Testing Volume
	public void testVolume() {
		assertEquals(4.19f, normalSphere.volume(), 0.01);
		assertEquals(0.0f, negativeSphere.volume(), 0.0);
		assertEquals(0.0f, zeroSphere.volume(), 0.0);
	}

	@Test //Testing constructor and logic
	public void testSphereFloat() {
		assertEquals(1.0f, normalSphere.getRadius(), 0.0);

		assertEquals(0.0f, negativeSphere.getRadius(), 0.0);
		
		assertEquals(0.0f, zeroSphere.getRadius(), 0.0);

	}

	@Test //Testing getRadius
	public void testGetRadius() {
		assertEquals(1.0f, normalSphere.getRadius(), 0.0);
	}

}
