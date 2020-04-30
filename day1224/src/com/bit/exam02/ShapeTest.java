package com.bit.exam02;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangel t = new Triangel(10, 10, 20, 30);
		Cylinder c = new Cylinder(20, 20, 5, 20);
		Cube cu = new Cube(30, 30, 10, 10, 10);
		
		t.Draw();
		c.Draw();
		cu.Draw();
		
		//세개의 객체에게 호출한 메소드는 동일합니다.
		//그러나 t는 삼각형을 그리고, c는 원기둥, cu는 직육면체를 그립니다.
		//이와같이 객체에게 준 메시지는 동일한데
		//객체마다 하는일이 다른 것을 "다형성"이라고 합니다.
		
		//Shape [ArrayList<E>w Shape[100];
		
//		ArrayList<Shape> arr = new ArrayList<Shape> ();
//		
//		arr.add(new Circle(10, 10, 50));
//		arr.add(new Cube(10, 120, 50, 50, 50));
//		arr.add(new Cylinder(10, 200, 50, 200));
//		
//		for( Shape p :arr ) {
//			System.out.println(p);
//			if( p  instanceof TwoDimShape ) {
//				((TwoDimShape)p).calcArea();
//				System.out.println("도형의 면적:"+((TwoDimShape)p).getArea());
//			}else if(p instanceof ThreeDimShape) 
//				((ThreeDimShape)p).calcVolume();{
//				System.out.println("도형의 부피:"+((ThreeDimShape)p).getVolume());
//			}
//		}
	}

}
