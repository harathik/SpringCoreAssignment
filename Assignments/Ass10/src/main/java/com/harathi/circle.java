package com.harathi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class circle {
	
	private Point A;

	public Point getA() {
		return A;
	}
	@Autowired
	@Qualifier("x")
	public void setA(Point a) {
		A = a;
	}
	public void output() {
		System.out.println("Drawing Circle");
		System.out.println("Center of circle is (" +this.getA().getX()+ "," +this.getA().getY()+ ")");

	}
}
