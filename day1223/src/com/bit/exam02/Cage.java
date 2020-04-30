package com.bit.exam02;

public class Cage {
	
	private Animal animal;
	// Cage에 담을 수 있는 자료형을 모든 동물로 설정하려고 해요. 
	// 그러니까 Tiger도 담을 수 있고, Lion도 담고 싶어요. 
	// 그래서 animal의 자료형을 Animal로 설정합니다. 
	// 즉 Animal의 후손인 누구라도 담을 수 있어요. 
	
	//Cage 클래스는 멤버변수로 animal의 객체를 가져요.
	//이러한 관계를 Cage has a Animal로 표현할 수 있어요.
	//두 클래스는 has a 관계
	
	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


}
