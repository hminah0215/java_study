package com.bit.exam02;

public class CageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal a = new Tiger();
		//Animal b = new Lion();
		//참조변수의 자료형을 Animal로 선언하게되면 
		//그것과 is a 관계에 있는(상속관계에 있는) 자식클래스의
		//객체 누구라도 참조할 수 있어요. 
		
		Cage cage = new Cage();
		//cage.setAnimal(a);
		//cage.setAnimal(b);
		
		//Cage의 멤버변수 animal의 자료형을 
		//Animal로 설정했기 때문에 Animal과 is a 관계에 있는 누구라도 담을 수 있음.
		//Tiger 와 Lion 모두 담을 수 있어요.
		
		cage.setAnimal(new Tiger());
		//Tiger 객체를 생성한 변수를 담아도 되고
		// 바로 객체를 생성하여 담을수도 있어요. 
		
		cage.setAnimal(new Lion());
		
		
	}

}
