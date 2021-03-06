class Person
{
	private String name;
	private int age;
	
	public String toString(){
		return name+","+age;
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person(){
		this("홍길동",20);
		System.out.println("생성자 동작해요.");
		/* this는 생성자안의 첫번째 문장에 와야함. 꼭. 
		name = "홍길동";
		age = 20;
		
		이걸 생성자가 중복된 상태이니 this() 를 써서 표현할 수 있음. 
		*/
	}
}



class PersonTest 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("이수인",28);
		System.out.println(p1);
		Person p2 = new Person(); //this() 값이 출력
		System.out.println(p2);
	}
}
