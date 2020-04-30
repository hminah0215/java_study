class Person
{
	private String name;
	private int age;
	
	//생성자
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void info(){
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		
	}
}



class PersonTest03
{
	public static void main(String[] args) 
	{
		Person p = new Person("홍길동",20 ); 
		p.info(); 
	}
}
