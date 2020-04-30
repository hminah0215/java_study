package com.bit.exam02;

public abstract class ThreeDimShape extends Shape {
	protected double volume;
	public abstract void calcVolume();

	public ThreeDimShape(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public double getVolume() {
		return volume;
	}
	
}
