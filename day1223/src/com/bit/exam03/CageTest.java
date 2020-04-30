package com.bit.exam03;

public class CageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Tiger();
		Animal b = new Lion();
		
		Cage cage = new Cage();
		cage.setAnimal(a);
		// 현재 Cage의 animal멤벼변수는 Tiger로 설정되어있어요. 
		// Tiger와 is a 관계에 있는 것만 담을 수 있어요. 
		// 현재 Tiger의 후손은 없으니 Tiger만 설정할 수 있어요. 
		// 부모는 몰라요. Tiger의 부모 Animal은 담을 수 없어요.
		
		Tiger c = new Tiger();
		cage.setAnimal(c);
		
		Lion d = new Lion();
		//cage.setAnimal(d);
		//부모도 못담으니 나와 형제간인 Lion도 못담아요. 
		
	}

}
