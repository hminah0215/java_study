package com.bit.exam06;

import java.util.ArrayList;

public class CageTest {  

	public static void main(String[] args) {
		
		Cage cage = new Cage();
		cage.animal.add(new Lion("비트사자"));
		cage.animal.add(new Tiger(2019));
		cage.animal.add(new Tiger(2020));
		cage.animal.add(new Lion("멋진사자"));
		
		for(int i = 0 ; i < cage.animal.size(); i++) {
			Animal animal = cage.animal.get(i);
			System.out.println(animal);
			
			if(animal instanceof Tiger) { //둘이 is a  관계에 있는지 묻는것
				//Tiger t  = (Tiger)animal;
				//t.proTiger();
				
				((Tiger)animal).proTiger();	
				
			}else if(animal instanceof Lion) {
				((Lion)animal).proLion();
			}
		}
		
	}

}
