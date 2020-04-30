class Person
{
	private String name;
	private int age;
	private boolean aa;
	
	public void info(){
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("불린: " + aa);
	}
}



class PersonTest 
{
	public static void main(String[] args) 
	{
		Person p = new Person(); //생성자를 만들지 않아도 기본생성자가 제공된다. 
		//기본생성자는 매개변수가 없고, 변수타입에 따라 초기화된다. 
		//생성자가 한개라도 있으면 기본생성자는 제공되지 않는다. 
		//생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다.
		p.info(); //이름 : null
					 //나이 : 0 으로 출력됨.
					 //불린 : flase 로 출력됨
	}
}
