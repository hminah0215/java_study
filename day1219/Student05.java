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
		Person p1 = new Student("�̼���", 20, "��ǻ�Ͱ���");
		//��Ʈ �θ�Ŭ������ �������� ����!
		//�θ�Ŭ������ �ڽ�Ŭ���� ��ü�� ������ �� �ִ�. 
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(   ((Student)p1).major  );  
		//�ڽ�Ŭ������ ĳ����! .�� �켱������ �����ϱ� ��ȣ �������� �ȵ� 


		/*System.out.println(p1.major); ������ �ڽ����׼� �߰��� ������� ������ �� ����.
				Student05.java:29: error: cannot find symbol
                System.out.println(p1.major);
                                     ^
			symbol:   variable major
			 location: variable p1 of type Person
				1 error
		*/ 

		//������ ������ �����غ�����. 7,8�� 
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
