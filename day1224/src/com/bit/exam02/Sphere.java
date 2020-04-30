package com.bit.exam02;

public class Sphere extends ThreeDimShape {
	
	private double radius;
	
	public Sphere(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
		//calcVolume();
	}

	@Override
	public void calcVolume() {
		// TODO Auto-generated method stub
		//volume = 4/3 * Math.PI * radius * radius * radius;
		volume = 4/3 * Math.PI * Math.pow(radius, 3);
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
		System.out.println("구를 그립니다.");
	}
	
}
