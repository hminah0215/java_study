class Person  {  //사용자 정의 자료형! 새로운 자료형을 만들었음. 

	String name;
	int age;

}

class  CallByReferenceTest02
{

	//Person을 매개변수로 전달받아 나이를 1증가하는 메소드를 정의 
	public static void plus(Person p){
		p.age = p.age +1;
	}
	public static void main(String[] args) 
	{
		Person suin = new Person(); //여기서 suin 은 객체참조변수
		suin.name = "이수인"; //suin이 바라보고 있는 곳에 있는 이름을 이수인으로해라.
		suin.age = 20; //suin이 바라보고 있는 곳에 있는 나이를 20으로 해라. 

		plus( suin );  //참조에 의한 호출.
		System.out.println(suin.name);
		System.out.println(suin.age);

	}
}
