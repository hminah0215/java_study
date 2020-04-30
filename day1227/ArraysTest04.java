import java.util.Arrays;
class Person
{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

//��ü�� �迭�� �Ȱ����� �Ǵ��Ϸ��� equals�� �̸� ����������Ѵ�. 
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
		Person p1 = new Person("ȫ�浿",20);
		Person p2 = new Person("ȫ�浿",20);
		if(p1.equals(p2)){
			System.out.println("�� ��ü�� ���ƿ�");
		}else{
			System.out.println("�� ��ü�� �޶��");
		}
		
		
		//int a[] = {1,2,3};
		Person []a = {new Person("ȫ�浿",20),new Person("�̼���",40)};
		Person []b = {new Person("ȫ�浿",20),new Person("�̼���",50)};
		if(Arrays.equals(a,b)){
			System.out.println("�� �迭�� ���ƿ�");
		}else{
			System.out.println("�� �迭�� �޶��");
		}
		

	}
}
