abstract class A
{
	abstract public void pro();
}

interface B //�������̽��� �����߻�. abstract����
{
	public void info();
}

class C extends A implements B //��������� c�� a�� Ȯ���ϰ� b�� �����Ѵ�.
{
	public void pro(){
		System.out.println("pro�Դϴ�.");
	}
	public void info(){
		System.out.println("info�Դϴ�.");
	}
}



class InterFaceTest03
{
	public static void main(String[] args) 
	{
		C ob = new C();
		ob.info();
		ob.pro();
	}
}