class Person
{
	public void sayHello(){
		System.out.println("�ȳ�");
	}
}

interface A
{
	public void pro();
}

interface B //�������̽��� �����߻�. abstract����
{
	public void info();
}

class C extends Person implements A, B //extends�� 1���� implements�� ����������
{
	public void pro(){
		System.out.println("pro�Դϴ�.");
	}
	public void info(){
		System.out.println("info�Դϴ�.");
	}
}



class InterFaceTest05
{
	public static void main(String[] args) 
	{
		C ob = new C();
		ob.info();
		ob.pro();
		ob.sayHello();
	}
}
