//��� ������ �տ� �ִ� ���̳�
class Person
{
	String name;
	int age;

	final String addr = "����� ������ �ż���"; 
	//ó���� �̿ܿ� �ٸ����� ���� ���� �� ����
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name +","+age+","+addr;
	}
}

class  FinalTest01
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("�̼���",20);
		System.out.println(p1);
		p1.age = 22;
		p1.name ="�̼���";
		//p1.addr ="���ֵ� �������� �ֿ���";
		//final������ ���� ������ �� �����~ 
		//���������� ���ó�� ����ϰ��� �Ҷ� ����ؿ�.
		System.out.println(p1);
	}
}