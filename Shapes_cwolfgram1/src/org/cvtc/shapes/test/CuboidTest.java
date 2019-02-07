package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.junit.Test;

public class CuboidTest {

	Cuboid normalCuboid = new Cuboid(1.0f, 1.0f, 1.0f);
	Cuboid negativeCuboid = new Cuboid(-1.0f, -1.0f, -1.0f);
	Cuboid zeroCuboid = new Cuboid(0.0f, 0.0f, 0.0f);
	
	@Test
	public void testSurfaceArea() {
		assertEquals(6.0f, normalCuboid.surfaceArea(), 0.0);
		assertEquals(0.0f, negativeCuboid.surfaceArea(), 0.0);
		assertEquals(0.0f, zeroCuboid.surfaceArea(), 0.0);
	}

	@Test
	public void testVolume() {
		assertEquals(1.0f, normalCuboid.volume(), 0.0);
		assertEquals(0.0f, negativeCuboid.volume(), 0.0);
		assertEquals(0.0f, zeroCuboid.volume(), 0.0);
	}

	@Test
	public void testCuboidFloatFloatFloat() {
		
		assertEquals(1.0f, normalCuboid.getWidth(), 0.0);
		assertEquals(0.0f, negativeCuboid.getHeight(), 0.0);
		assertEquals(0.0f, zeroCuboid.getDepth(), 0.0);
				
		
	}

	@Test
	public void testGetWidth() {
		assertEquals(1.0f, normalCuboid.getWidth(), 0.0);
	}

	@Test
	public void testGetHeight() {
		assertEquals(1.0f, normalCuboid.getHeight(), 0.0);
	}

	@Test
	public void testGetDepth() {
		assertEquals(1.0f, normalCuboid.getDepth(), 0.0);
	}

}
