//equals 이번엔 속성을 비교해서 같다고 나옴.  
class Person
{
	private String name;
	private int age;
	public boolean equals(Object obj){  //오브젝트 클래스의 이퀄즈. 재정의
		Person p = (Person)obj;
		if( name.equals( p.name ) && age == p.age ){
			return true;
		}else{
			return false;
		}

	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name+","+ age;
	}
}


class	EqualsTest02
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("최영수",20);
		Person p2 = new Person("최영수",20);

		System.out.println(p1);
		System.out.println(p2);

		if(p1.equals(p2) ){
			System.out.println("같아요");
		}else{
			System.out.println("달라요");
		}
	}
}
