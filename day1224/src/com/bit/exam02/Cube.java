package com.bit.exam02;

public class Cube extends ThreeDimShape {
	private double width;
	private double height;
	private double length;
	
	public Cube(int x, int y, double width, double height, double length) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.length = length;
		//calcVolume();
	}

	@Override
	public void calcVolume() {
		// TODO Auto-generated method stub
		volume = width * height * length;
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

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("직육면체를 그립니다.");
	}
	
}
