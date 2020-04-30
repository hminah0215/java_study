class Person
{
	private String name;
	private int age;
	
	//생성자
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person(){
		
	}
	
	public void info(){
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		
	}
}



class PersonTest04
{
	public static void main(String[] args) 
	{
		Person p = new Person("홍길동",20 );   //이름: 홍길동  나이: 20 출력
		p.info(); 
		Person p2 = new Person(); //이름: null  나이 : 0 출력
		p2.info();

	}
}
