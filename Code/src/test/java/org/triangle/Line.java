package org.triangle;

import java.awt.Point;
import java.util.Arrays;
import java.util.List;

public class Line {

	private Point startingPoint;
	private Point endPoint;

	public Line(Point startingPoint, Point endPoint) {
		this.startingPoint = startingPoint;
		this.endPoint = endPoint;
	}

	public static Line makeLine(Point p1, Point p2) {
		return new Line(p1, p2);
	}

	public double getLength() {
		double y = endPoint.getY() - startingPoint.getY();
		double x = endPoint.getX() - startingPoint.getX();
		return Math.sqrt(x * x + y * y);
	}

	public List<Point> getPoints() {
		return Arrays.asList(startingPoint, endPoint);
	}

	@Override
	public String toString() {
		return String.format("line = (%s,%s)(%s,%s)", startingPoint.getX(), startingPoint.getY(), endPoint.getX(),
				endPoint.getY());
	}
}
