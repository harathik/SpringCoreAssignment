package org.harathi.javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw()
	{
		System.out.println("Point A = ( " +getPointA().getX() + ", " +getPointA().getY() + ")");
		System.out.println("Point A = ( " +getPointB().getX() + ", " +getPointB().getY() + ")");
		System.out.println("Point A = ( " +getPointC().getX() + ", " +getPointC().getY() + ")");
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("InitializingBean init method called for Triangle");
	 * 
	 * }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("DisposableBean destroy method called for Triangle");
	 * 
	 * }
	 */
	
	public void myInit()
	{
		System.out.println("MY own Init() called");
	}
	public void cleanUp()
	{
		System.out.println("My own Destroy() called");
	}

}
