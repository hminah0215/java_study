abstract class A
{
	abstract public void pro();
}

abstract class B
{
	abstract public void info();
}

class C extends A,B
{ /*
InterFaceTest02.java:11: error: '{' expected
class C extends A,B
1�����ϰ� ��������. 

�ڹٿ����� Ŭ������ ���߻���� �� �� �����!
���߻���� ȿ���� ����ϱ� ���ؼ��� �������̽��� ����ؿ�!
*/
	public void pro(){
		System.out.println("pro�Դϴ�.");
	}
	public void info(){
		System.out.println("info�Դϴ�.");
	}
}



class InterFaceTest02
{
	public static void main(String[] args) 
	{
		C pob = new C();
		ob.info();
		ob.pro();
	}
}