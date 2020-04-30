package com.bit.exam04;

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
		
		
		cage.setAnimal(new Lion("비트사자"));
//		Lion l = (Lion)cage.getAnimal();
//		l.proLion();
		Tiger t = (Tiger)cage.getAnimal();
//		t.proTiger();
		System.out.println("ok");
	
		//Cage의 멤버변수 animal의 자료형을 
		//Animal로 설정했기 때문에 Animal과 is a 관계에 있는 누구라도 담을 수 있음.
		//Tiger 와 Lion 모두 담을 수 있어요.
		
		//cage.setAnimal(new Tiger());
		//Tiger 객체를 생성한 변수를 담아도 되고
		// 바로 객체를 생성하여 담을수도 있어요. 
		
	//	cage.setAnimal(new Lion());
		//Lion lion = cage.getAnimal(); 안됨 
	//	Lion lion = (Lion)cage.getAnimal();
		
//		Object ob = new Lion(); //이건 가능 
//		Lion l = new Object(); // 이건 안됨
		// 부모클래스의 참조변수가 자식을 바라볼 수는 있지만
		// 자식클래스의 참조변수가 부모를 바라볼 수는 없어요. 
		// 대입연산자를 기준으로 좌우의 자료형이 is a 관계가 성립이 될때 
		// 부모클래스의 객체를 자식클래스의 참조변수에 담기위해서는 
		// 형 변환 연산을 수행해야해요. 
		
		
		
		//Tiger t = new Tiger();
		//Lion l = (Lion)t;
		//형제지간끼리는 형변환을 할 수 없다. 
		
		
		
	}

}
