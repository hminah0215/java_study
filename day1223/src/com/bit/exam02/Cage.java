package com.bit.exam02;

public class Cage {
	
	private Animal animal;
	// Cage�� ���� �� �ִ� �ڷ����� ��� ������ �����Ϸ��� �ؿ�. 
	// �׷��ϱ� Tiger�� ���� �� �ְ�, Lion�� ��� �;��. 
	// �׷��� animal�� �ڷ����� Animal�� �����մϴ�. 
	// �� Animal�� �ļ��� ������ ���� �� �־��. 
	
	//Cage Ŭ������ ��������� animal�� ��ü�� ������.
	//�̷��� ���踦 Cage has a Animal�� ǥ���� �� �־��.
	//�� Ŭ������ has a ����
	
	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


}
