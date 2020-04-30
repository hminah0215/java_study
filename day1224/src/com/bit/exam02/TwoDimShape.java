package com.bit.exam02;

public abstract class TwoDimShape extends Shape {
	protected double area;
	public abstract void calcArea();
	
	public TwoDimShape(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public double getArea() {
		return area;
	}


	
}
