class Person
{
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void info(){
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		
	}
}



class PersonTest02
{
	public static void main(String[] args) 
	{
		Person p = new Person(); 
		p.info(); 
	}
}
