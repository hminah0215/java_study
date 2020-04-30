class Animal
{
}
class Lion extends Animal
{
}
class Tiger extends Animal
{
}


class	Cage
{
	private Object animal;
	public void setAnimal(Object x){
		animal = x;
	}
	public Object getAnimal(){
		return animal;
	}
	public static void main(String[] args) 
	{
		Cage cage = new Cage();
		cage.setAnimal(new Lion());
		//Lion lion = cage.getAnimal();
		//Lion lion = (Lion)cage.getAnimal();
		Tiger tiger = (Tiger)cage.getAnimal();
	}
}


/*1번질문
Lion lion = cage.getAnimal(); 에서 나는 오류. 
Cage.java:25: error: incompatible types: 
Object cannot be converted to Lion
     Lion lion = cage.getAnimal();

2번질문 : 오류 안나고 컴파일됨

*/