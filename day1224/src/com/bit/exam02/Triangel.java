package com.bit.exam02;

public class Triangel extends TwoDimShape {
	private double width;
	private double height;
	
	public Triangel(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
		//calcArea();
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area = width * height /2;	
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그립니다.");
	}
	

}
