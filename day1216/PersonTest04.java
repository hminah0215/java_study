class Person
{
	private String name;
	private int age;
	
	//������
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person(){
		
	}
	
	public void info(){
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		
	}
}



class PersonTest04
{
	public static void main(String[] args) 
	{
		Person p = new Person("ȫ�浿",20 );   //�̸�: ȫ�浿  ����: 20 ���
		p.info(); 
		Person p2 = new Person(); //�̸�: null  ���� : 0 ���
		p2.info();

	}
}