class Person
{
	String name;
	int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Student extends Person
{
	String major;
	public Student(String name, int age, String major){
		super(name, age);
		this.major = major;
	}
}
class  Student05
{
	public static void main(String[] args) 
	{
		Person p1 = new Student("이수인", 20, "컴퓨터과학");
		//노트 부모클래스의 참조변수 참고!
		//부모클래스로 자식클래스 객체를 생성할 수 있다. 
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(   ((Student)p1).major  );  
		//자식클래스로 캐스팅! .이 우선순위가 높으니까 괄호 빼먹으면 안됨 


		/*System.out.println(p1.major); 하지만 자식한테서 추가된 멤버에는 접근할 수 있음.
				Student05.java:29: error: cannot find symbol
                System.out.println(p1.major);
                                     ^
			symbol:   variable major
			 location: variable p1 of type Person
				1 error
		*/ 

		//나머지 내용을 실험해보세요. 7,8번 
		/*
		Movable m = new Car();
		m.speedUp();
		m.turnLeft();

		Student05.java:44: error: constructor Car in class Car cannot be applied to give
		n types;
                Movable m = new Car();
                            ^
		required: String,String,String,String
		 found: no arguments
		 reason: actual and formal argument lists differ in length
		Student05.java:45: error: method speedUp in interface Movable cannot be applied
		to given types;
                m.speedUp();
                 ^
		 required: int
		 found: no arguments
		reason: actual and formal argument lists differ in length
		Student05.java:46: error: cannot find symbol
                m.turnLeft();
                 ^
			symbol:   method turnLeft()
			 location: variable m of type Movable
			3 errors
				*/
		
		
	}

}
