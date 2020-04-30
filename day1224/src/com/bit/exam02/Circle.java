package com.bit.exam02;

public class Circle extends TwoDimShape {
	private double radius;
	//public final static double  PI = 3.141592;
			
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
		//calcArea();
	}



	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area = Math.PI * radius * radius; 
		// 메뉴열보면 Math에 pi값이 있어서 굳이 상수처리안해도됨
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그립니다.");
	}
	
}
