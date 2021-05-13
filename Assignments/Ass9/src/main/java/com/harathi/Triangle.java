package com.harathi;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean,DisposableBean {
	private Point A;
	private Point B;
	private Point C;
	
	
	public Point getA() {
		return A;
	}
	public void setA(Point a) {
		A = a;
	}
	public Point getB() {
		return B;
	}
	public void setB(Point b) {
		B = b;
	}
	public Point getC() {
		return C;
	}
	public void setC(Point c) {
		C = c;
	}
	
	public void output() {
		System.out.println("Drawing Triangle");
		System.out.println("Point A (" +this.getA().getX()+ "," +this.getA().getY()+ ")");
		System.out.println("Point B (" +this.getB().getX()+ "," +this.getB().getY()+ ")");
		System.out.println("Point C (" +this.getC().getX()+ "," +this.getC().getY()+ ")");

	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Intializing Bean Interface of triangle class is called.");
		
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Disposable Bean Interface of triangle class is called.");
	}
	
	public void beforeInitlization() {
		System.out.println("Method Called Before Intialization");
	}
	
	public void afterInitlization() {
		System.out.println("Method Called Before Destroying");
	}
	
	

}
