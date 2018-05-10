package org.triangle;

import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.approvaltests.Approvals;
import org.junit.Test;

public class TriangleTest {

	@Test
	public void testLine() {
		Line line = Line.makeLine(new Point(0, 0), new Point(0, 5));
		assertEquals(5.0, line.getLength(), 1e-4);
	}

	@Test
	public void testHorizontal() {
		Line line = Line.makeLine(new Point(0, 0), new Point(5, 0));
		assertEquals(5.0, line.getLength(), 1e-4);
	}

	@Test
	public void testDiagonal() {
		Line line = Line.makeLine(new Point(0, 0), new Point(4, 3));
		assertEquals(5.0, line.getLength(), 1e-4);
	}

	@Test
	public void testLineEndpoints() {
		Line line = Line.makeLine(new Point(2, 1), new Point(6, 5));
		Approvals.verifyAll("linepoints", line.getPoints());
	}

	@Test
	public void testTriangle() throws Exception {
		// make a new /\ with point (1,2), (5,3),(2,6)
		Triangle triangle = new Triangle(new Point(1, 2), new Point(5, 3), new Point(2, 6));
		// verify the ....
		Approvals.verifyAll("trianglePoints", triangle.getPoints());
	}

	@Test
	public void testTriangleLines() throws Exception {
		// make a new /\ with point (1,2), (5,3),(2,6)
		Triangle triangle = new Triangle(new Point(1, 2), new Point(5, 3), new Point(2, 6));
		// verify lines
		Approvals.verifyAll("triangleLines", triangle.getLines());
	}

	@Test
	public void shouldReturnLines() throws Exception {
		// make a new /\ with point (1,2), (5,3),(2,6)
		Triangle triangle = new Triangle(new Point(1, 2), new Point(5, 3), new Point(2, 6));

		// verify lines which points are (1,2)
		Approvals.verifyAll("triangleLinesByPoints", triangle.getCrossingLines(new Point(1, 2)));
	}

	@Test
	public void testTriangleState() throws Exception {
		Triangle triangle = new Triangle(new Point(1, 2), new Point(5, 3), new Point(2, 6));
		Approvals.verifyAsJson(triangle);
	}
}
