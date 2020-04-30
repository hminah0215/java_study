package com.bit.exam05;


/*
 Cage 객체 생성시에
 animal의 자료형을 결정하도록 제네릭으로 설정해요.
 class Cage<T>
 T는 그냥 애칭이니 마음대로 정해도 됩니다.
 main 메소드에서 Cage<Tiger> c = new Cage<Tiger>라고 한다면 
 T는 Tiger로 변환되어 처리됩니다. 
 즉,animal 의 자료형을 Tiger로 하겠다라는 의미입니다. 
 만약 Cage<Animal> c  = new Cage<animal>라고 한다면 
 T는 Animal로 변환되어 처리됩니다. 
*/

public class Cage<T> {
	
	private T animal;

	
	public T getAnimal() {
		return animal;
	}


	public void setAnimal(T animal) {
		this.animal = animal;
	}


}
