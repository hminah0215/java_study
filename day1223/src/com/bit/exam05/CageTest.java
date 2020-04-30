package com.bit.exam05;

import java.util.ArrayList;

public class CageTest {  

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//ArrayList<String>list = new ArrayList<String>();
		//ArrayList<Lion>list = new ArrayList<Lion>();
		
		Cage<Lion>cage = new Cage<Lion>();
		cage.setAnimal(new Lion("비트사자"));
		Lion lion = cage.getAnimal();
		lion.proLion();
		
		Cage<Tiger> cage2 = new Cage<Tiger>();
		cage2.setAnimal(new Tiger(2019));
		Tiger t = cage2.getAnimal();
		t.proTiger();
		
		Cage<Animal> cage3 = new Cage<Animal>();
		cage3.setAnimal(new Tiger(2019));
		cage3.setAnimal(new Lion("비트사자"));
		
		
	}

}
