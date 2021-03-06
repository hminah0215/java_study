import java.util.Arrays;
class Person
{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

//객체의 배열을 똑같은지 판단하려면 equals가 미리 만들어져야한다. 
	public boolean equals(Object ob){
		
		boolean re = false;
		Person p = (Person)ob;
		if(name.equals(p.name) && age== p.age){
			re = true;
		}
		return re;
	}
}

class ArraysTest04 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("홍길동",20);
		if(p1.equals(p2)){
			System.out.println("두 객체는 같아요");
		}else{
			System.out.println("두 객체는 달라요");
		}
		
		
		//int a[] = {1,2,3};
		Person []a = {new Person("홍길동",20),new Person("이순신",40)};
		Person []b = {new Person("홍길동",20),new Person("이순신",50)};
		if(Arrays.equals(a,b)){
			System.out.println("두 배열은 같아요");
		}else{
			System.out.println("두 배열은 달라요");
		}
		

	}
}
