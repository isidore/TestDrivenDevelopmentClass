package org.triangle;

import java.awt.Point;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Triangle {

	@Override
	public String toString() {
		return "Triangle [point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + "]";
	}

	private Point point1;
	private Point point2;
	private Point point3;

	public Triangle(Point point1, Point point2, Point point3) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	public List<Point> getPoints() {
		return Arrays.asList(point1, point2, point3);
	}

	public List<Line> getLines() {
		Line line1 = Line.makeLine(point1, point2);
		Line line2 = Line.makeLine(point2, point3);
		Line line3 = Line.makeLine(point3, point1);
		return Arrays.asList(line1, line2, line3);
	}

	public List<Line> getCrossingLines(Point point) {
		// check if point exists in lines
		return getLines().stream().filter(l -> l.getPoints().contains(point)).collect(Collectors.toList());
	}

}
